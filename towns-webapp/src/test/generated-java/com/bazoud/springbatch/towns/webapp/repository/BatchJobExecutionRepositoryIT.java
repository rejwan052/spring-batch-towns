/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-backend-jpa:src/test/java/service/RepositoryIT.e.vm.java
 */
package com.bazoud.springbatch.towns.webapp.repository;

import static com.google.common.collect.Sets.newHashSet;
import static org.fest.assertions.Assertions.assertThat;

import java.util.Set;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.bazoud.springbatch.towns.webapp.domain.BatchJobExecution;

/**
 * Integration test on BatchJobExecutionRepository
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring/applicationContext-test.xml" })
@Transactional
public class BatchJobExecutionRepositoryIT {
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(BatchJobExecutionRepositoryIT.class);

    @PersistenceContext
    private EntityManager entityManager;

    @Inject
    private BatchJobExecutionRepository batchJobExecutionRepository;

    @Inject
    private BatchJobExecutionGenerator batchJobExecutionGenerator;

    @Test
    @Rollback
    public void saveAndGet() {
        BatchJobExecution batchJobExecution = batchJobExecutionGenerator.getBatchJobExecution();

        // add it to a Set before saving (force equals/hashcode)
        Set<BatchJobExecution> set = newHashSet(batchJobExecution, batchJobExecution);
        assertThat(set).hasSize(1);

        batchJobExecutionRepository.save(batchJobExecution);
        entityManager.flush();

        // reload it from cache and check equality
        BatchJobExecution model = new BatchJobExecution();
        model.setId(batchJobExecution.getId());
        assertThat(batchJobExecution).isEqualTo(batchJobExecutionRepository.get(model));

        // clear cache to force reload from db
        entityManager.clear();

        // since you use a business key, equality must be preserved.
        assertThat(batchJobExecution).isEqualTo(batchJobExecutionRepository.get(model));
    }

}
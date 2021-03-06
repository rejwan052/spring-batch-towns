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

import com.bazoud.springbatch.towns.webapp.domain.BatchStepExecution;

/**
 * Integration test on BatchStepExecutionRepository
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring/applicationContext-test.xml" })
@Transactional
public class BatchStepExecutionRepositoryIT {
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(BatchStepExecutionRepositoryIT.class);

    @PersistenceContext
    private EntityManager entityManager;

    @Inject
    private BatchStepExecutionRepository batchStepExecutionRepository;

    @Inject
    private BatchStepExecutionGenerator batchStepExecutionGenerator;

    @Test
    @Rollback
    public void saveAndGet() {
        BatchStepExecution batchStepExecution = batchStepExecutionGenerator.getBatchStepExecution();

        // add it to a Set before saving (force equals/hashcode)
        Set<BatchStepExecution> set = newHashSet(batchStepExecution, batchStepExecution);
        assertThat(set).hasSize(1);

        batchStepExecutionRepository.save(batchStepExecution);
        entityManager.flush();

        // reload it from cache and check equality
        BatchStepExecution model = new BatchStepExecution();
        model.setId(batchStepExecution.getId());
        assertThat(batchStepExecution).isEqualTo(batchStepExecutionRepository.get(model));

        // clear cache to force reload from db
        entityManager.clear();

        // since you use a business key, equality must be preserved.
        assertThat(batchStepExecution).isEqualTo(batchStepExecutionRepository.get(model));
    }

}
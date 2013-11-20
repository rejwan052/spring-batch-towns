/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-backend-jpa:src/main/java/repository/Repository.e.vm.java
 */
package com.bazoud.springbatch.towns.webapp.repository;

import javax.inject.Named;
import javax.inject.Singleton;

import com.bazoud.springbatch.towns.webapp.domain.BatchStepExecutionSeq;
import com.bazoud.springbatch.towns.webapp.repository.support.GenericRepository;

/**
 * {@link GenericRepository} for {@link BatchStepExecutionSeq} 
 */
@Named
@Singleton
public class BatchStepExecutionSeqRepository extends GenericRepository<BatchStepExecutionSeq, Long> {

    public BatchStepExecutionSeqRepository() {
        super(BatchStepExecutionSeq.class);
    }

    @Override
    public BatchStepExecutionSeq getNew() {
        return new BatchStepExecutionSeq();
    }

    @Override
    public BatchStepExecutionSeq getNewWithDefaults() {
        return getNew().withDefaults();
    }
}
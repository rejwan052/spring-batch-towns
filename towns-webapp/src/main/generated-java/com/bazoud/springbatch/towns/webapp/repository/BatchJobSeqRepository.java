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

import com.bazoud.springbatch.towns.webapp.domain.BatchJobSeq;
import com.bazoud.springbatch.towns.webapp.repository.support.GenericRepository;

/**
 * {@link GenericRepository} for {@link BatchJobSeq} 
 */
@Named
@Singleton
public class BatchJobSeqRepository extends GenericRepository<BatchJobSeq, Long> {

    public BatchJobSeqRepository() {
        super(BatchJobSeq.class);
    }

    @Override
    public BatchJobSeq getNew() {
        return new BatchJobSeq();
    }

    @Override
    public BatchJobSeq getNewWithDefaults() {
        return getNew().withDefaults();
    }
}
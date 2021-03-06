/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-jsf2-spring-conversation:src/main/java/domain/GraphLoader.e.vm.java
 */
package com.bazoud.springbatch.towns.webapp.web.domain;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import com.bazoud.springbatch.towns.webapp.domain.BatchJobExecutionParams;
import com.bazoud.springbatch.towns.webapp.repository.BatchJobExecutionParamsRepository;
import com.bazoud.springbatch.towns.webapp.repository.support.EntityGraphLoader;

/**
 * Preloads the {@link BatchJobExecutionParams} associations required by the view layer.
 * 
 * Do not use other GraphLoaders in this GraphLoader. 
 */
@Named
@Singleton
public class BatchJobExecutionParamsGraphLoader extends EntityGraphLoader<BatchJobExecutionParams, Long> {
    // required by cglib to create a proxy around the object as we are using the @Transactional annotation
    protected BatchJobExecutionParamsGraphLoader() {
        super();
    }

    @Inject
    public BatchJobExecutionParamsGraphLoader(BatchJobExecutionParamsRepository batchJobExecutionParamsRepository) {
        super(batchJobExecutionParamsRepository);
    }

    @Override
    public void loadGraph(BatchJobExecutionParams batchJobExecutionParams) {
        loadSingular(batchJobExecutionParams.getBatchJobExecution());
    }
}
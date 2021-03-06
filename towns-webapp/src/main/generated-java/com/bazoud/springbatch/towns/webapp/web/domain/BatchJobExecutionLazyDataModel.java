/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-jsf2-spring-conversation:src/main/java/domain/LazyDataModel.e.vm.java
 */
package com.bazoud.springbatch.towns.webapp.web.domain;

import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.model.LazyDataModel;

import com.bazoud.springbatch.towns.webapp.domain.BatchJobExecution;
import com.bazoud.springbatch.towns.webapp.repository.BatchJobExecutionRepository;
import com.bazoud.springbatch.towns.webapp.web.domain.support.GenericLazyDataModel;
import com.bazoud.springbatch.towns.webapp.web.faces.ConversationContextScoped;

/**
 * Provide PrimeFaces {@link LazyDataModel} for {@link BatchJobExecution}
 */
@Named
@ConversationContextScoped
public class BatchJobExecutionLazyDataModel extends GenericLazyDataModel<BatchJobExecution, Long, BatchJobExecutionSearchForm> {
    private static final long serialVersionUID = 1L;

    @Inject
    public BatchJobExecutionLazyDataModel(BatchJobExecutionRepository batchJobExecutionRepository, BatchJobExecutionController batchJobExecutionController,
            BatchJobExecutionSearchForm batchJobExecutionSearchForm, BatchJobExecutionExcelExporter batchJobExecutionExcelExporter) {
        super(batchJobExecutionRepository, batchJobExecutionController, batchJobExecutionSearchForm, batchJobExecutionExcelExporter);
    }
}
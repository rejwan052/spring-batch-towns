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

import com.bazoud.springbatch.towns.webapp.domain.BatchStepExecutionContext;
import com.bazoud.springbatch.towns.webapp.repository.BatchStepExecutionContextRepository;
import com.bazoud.springbatch.towns.webapp.web.domain.support.GenericLazyDataModel;
import com.bazoud.springbatch.towns.webapp.web.faces.ConversationContextScoped;

/**
 * Provide PrimeFaces {@link LazyDataModel} for {@link BatchStepExecutionContext}
 */
@Named
@ConversationContextScoped
public class BatchStepExecutionContextLazyDataModel extends GenericLazyDataModel<BatchStepExecutionContext, Long, BatchStepExecutionContextSearchForm> {
    private static final long serialVersionUID = 1L;

    @Inject
    public BatchStepExecutionContextLazyDataModel(BatchStepExecutionContextRepository batchStepExecutionContextRepository,
            BatchStepExecutionContextController batchStepExecutionContextController, BatchStepExecutionContextSearchForm batchStepExecutionContextSearchForm,
            BatchStepExecutionContextExcelExporter batchStepExecutionContextExcelExporter) {
        super(batchStepExecutionContextRepository, batchStepExecutionContextController, batchStepExecutionContextSearchForm,
                batchStepExecutionContextExcelExporter);
    }
}
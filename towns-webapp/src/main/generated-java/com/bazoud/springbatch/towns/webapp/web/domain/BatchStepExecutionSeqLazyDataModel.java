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

import com.bazoud.springbatch.towns.webapp.domain.BatchStepExecutionSeq;
import com.bazoud.springbatch.towns.webapp.repository.BatchStepExecutionSeqRepository;
import com.bazoud.springbatch.towns.webapp.web.domain.support.GenericLazyDataModel;
import com.bazoud.springbatch.towns.webapp.web.faces.ConversationContextScoped;

/**
 * Provide PrimeFaces {@link LazyDataModel} for {@link BatchStepExecutionSeq}
 */
@Named
@ConversationContextScoped
public class BatchStepExecutionSeqLazyDataModel extends GenericLazyDataModel<BatchStepExecutionSeq, Long, BatchStepExecutionSeqSearchForm> {
    private static final long serialVersionUID = 1L;

    @Inject
    public BatchStepExecutionSeqLazyDataModel(BatchStepExecutionSeqRepository batchStepExecutionSeqRepository,
            BatchStepExecutionSeqController batchStepExecutionSeqController, BatchStepExecutionSeqSearchForm batchStepExecutionSeqSearchForm,
            BatchStepExecutionSeqExcelExporter batchStepExecutionSeqExcelExporter) {
        super(batchStepExecutionSeqRepository, batchStepExecutionSeqController, batchStepExecutionSeqSearchForm, batchStepExecutionSeqExcelExporter);
    }
}
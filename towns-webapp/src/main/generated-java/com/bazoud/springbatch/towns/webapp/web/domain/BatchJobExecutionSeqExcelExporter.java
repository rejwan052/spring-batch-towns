/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-jsf2-spring-conversation:src/main/java/domain/ExcelExporter.e.vm.java
 */
package com.bazoud.springbatch.towns.webapp.web.domain;

import javax.inject.Inject;
import javax.inject.Named;

import com.bazoud.springbatch.towns.webapp.domain.BatchJobExecutionSeq;
import com.bazoud.springbatch.towns.webapp.web.domain.support.GenericExcelExporter;
import com.bazoud.springbatch.towns.webapp.web.faces.ConversationContextScoped;

/**
 * Exports to excel document {@link BatchJobExecutionSeq} search criteria and result. 
 */
@Named
@ConversationContextScoped
public class BatchJobExecutionSeqExcelExporter extends GenericExcelExporter<BatchJobExecutionSeq> {
    @Inject
    protected BatchJobExecutionSeqSearchForm sf;

    public BatchJobExecutionSeqExcelExporter() {
        super("batchJobExecutionSeq_id");
    }

    @Override
    protected void fillResultItem(int row, BatchJobExecutionSeq item) {
        int col = 0;
        setValue(row, col++, item.getId());
    }

    @Override
    public void fillSearchCriteria(int row) {
        useCriteriaSheet();

        setLeftHeader(row, 0, "batchJobExecutionSeq_id");
        setValue(row++, 1, sf.getBatchJobExecutionSeq().getId());
    }
}
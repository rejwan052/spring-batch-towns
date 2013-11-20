/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-jsf2-spring-conversation:src/main/java/domain/SearchForm.e.vm.java
 */
package com.bazoud.springbatch.towns.webapp.web.domain;

import static com.bazoud.springbatch.towns.webapp.repository.support.PropertySelector.newPropertySelector;

import javax.inject.Named;

import com.bazoud.springbatch.towns.webapp.domain.BatchJobExecutionSeq;
import com.bazoud.springbatch.towns.webapp.domain.BatchJobExecutionSeq_;
import com.bazoud.springbatch.towns.webapp.repository.support.PropertySelector;
import com.bazoud.springbatch.towns.webapp.repository.support.SearchParameters;
import com.bazoud.springbatch.towns.webapp.web.domain.support.GenericSearchForm;
import com.bazoud.springbatch.towns.webapp.web.faces.ConversationContextScoped;

/**
 * View Helper to search {@link BatchJobExecutionSeq}.
 * It exposes a {@link BatchJobExecutionSeq} instance so it can be used in search by-example-query.
 */
@Named
@ConversationContextScoped
public class BatchJobExecutionSeqSearchForm extends GenericSearchForm<BatchJobExecutionSeq, Long, BatchJobExecutionSeqSearchForm> {
    private static final long serialVersionUID = 1L;
    protected BatchJobExecutionSeq batchJobExecutionSeq = new BatchJobExecutionSeq();
    protected PropertySelector<BatchJobExecutionSeq, Long> idSelector = newPropertySelector(BatchJobExecutionSeq_.id);

    public BatchJobExecutionSeq getBatchJobExecutionSeq() {
        return batchJobExecutionSeq;
    }

    @Override
    protected BatchJobExecutionSeq getEntity() {
        return getBatchJobExecutionSeq();
    }

    @Override
    public BatchJobExecutionSeqSearchForm newInstance() {
        return new BatchJobExecutionSeqSearchForm();
    }

    @Override
    public SearchParameters toSearchParameters() {
        SearchParameters sp = searchParameters();
        sp.property(idSelector);
        return sp;
    }

    @Override
    public void resetWithOther(BatchJobExecutionSeqSearchForm other) {
        this.batchJobExecutionSeq = other.getBatchJobExecutionSeq();
        this.idSelector = other.getIdSelector();
    }

    // Property selectors
    public PropertySelector<BatchJobExecutionSeq, Long> getIdSelector() {
        return idSelector;
    }
}
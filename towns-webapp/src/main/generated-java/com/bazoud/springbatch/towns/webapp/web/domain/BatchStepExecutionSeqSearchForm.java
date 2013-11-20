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

import com.bazoud.springbatch.towns.webapp.domain.BatchStepExecutionSeq;
import com.bazoud.springbatch.towns.webapp.domain.BatchStepExecutionSeq_;
import com.bazoud.springbatch.towns.webapp.repository.support.PropertySelector;
import com.bazoud.springbatch.towns.webapp.repository.support.SearchParameters;
import com.bazoud.springbatch.towns.webapp.web.domain.support.GenericSearchForm;
import com.bazoud.springbatch.towns.webapp.web.faces.ConversationContextScoped;

/**
 * View Helper to search {@link BatchStepExecutionSeq}.
 * It exposes a {@link BatchStepExecutionSeq} instance so it can be used in search by-example-query.
 */
@Named
@ConversationContextScoped
public class BatchStepExecutionSeqSearchForm extends GenericSearchForm<BatchStepExecutionSeq, Long, BatchStepExecutionSeqSearchForm> {
    private static final long serialVersionUID = 1L;
    protected BatchStepExecutionSeq batchStepExecutionSeq = new BatchStepExecutionSeq();
    protected PropertySelector<BatchStepExecutionSeq, Long> idSelector = newPropertySelector(BatchStepExecutionSeq_.id);

    public BatchStepExecutionSeq getBatchStepExecutionSeq() {
        return batchStepExecutionSeq;
    }

    @Override
    protected BatchStepExecutionSeq getEntity() {
        return getBatchStepExecutionSeq();
    }

    @Override
    public BatchStepExecutionSeqSearchForm newInstance() {
        return new BatchStepExecutionSeqSearchForm();
    }

    @Override
    public SearchParameters toSearchParameters() {
        SearchParameters sp = searchParameters();
        sp.property(idSelector);
        return sp;
    }

    @Override
    public void resetWithOther(BatchStepExecutionSeqSearchForm other) {
        this.batchStepExecutionSeq = other.getBatchStepExecutionSeq();
        this.idSelector = other.getIdSelector();
    }

    // Property selectors
    public PropertySelector<BatchStepExecutionSeq, Long> getIdSelector() {
        return idSelector;
    }
}
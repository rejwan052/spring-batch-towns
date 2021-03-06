/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-jsf2-spring-conversation:src/main/java/domain/Controller.e.vm.java
 */
package com.bazoud.springbatch.towns.webapp.web.domain;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import com.bazoud.springbatch.towns.webapp.domain.BatchJobExecutionSeq;
import com.bazoud.springbatch.towns.webapp.printer.BatchJobExecutionSeqPrinter;
import com.bazoud.springbatch.towns.webapp.repository.BatchJobExecutionSeqRepository;
import com.bazoud.springbatch.towns.webapp.web.domain.support.GenericController;
import com.bazoud.springbatch.towns.webapp.web.permission.BatchJobExecutionSeqPermission;

/**
 * Stateless controller for {@link BatchJobExecutionSeq} conversation start.
 */
@Named
@Singleton
public class BatchJobExecutionSeqController extends GenericController<BatchJobExecutionSeq, Long> {
    public static final String BATCHJOBEXECUTIONSEQ_EDIT_URI = "/domain/batchJobExecutionSeqEdit.faces";
    public static final String BATCHJOBEXECUTIONSEQ_SELECT_URI = "/domain/batchJobExecutionSeqSelect.faces";

    @Inject
    public BatchJobExecutionSeqController(BatchJobExecutionSeqRepository batchJobExecutionSeqRepository,
            BatchJobExecutionSeqPermission batchJobExecutionSeqPermission, BatchJobExecutionSeqPrinter batchJobExecutionSeqPrinter) {
        super(batchJobExecutionSeqRepository, batchJobExecutionSeqPermission, batchJobExecutionSeqPrinter, BATCHJOBEXECUTIONSEQ_SELECT_URI,
                BATCHJOBEXECUTIONSEQ_EDIT_URI);
    }
}
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

import com.bazoud.springbatch.towns.webapp.domain.BatchJobExecutionContext;
import com.bazoud.springbatch.towns.webapp.printer.BatchJobExecutionContextPrinter;
import com.bazoud.springbatch.towns.webapp.repository.BatchJobExecutionContextRepository;
import com.bazoud.springbatch.towns.webapp.web.domain.support.GenericController;
import com.bazoud.springbatch.towns.webapp.web.permission.BatchJobExecutionContextPermission;

/**
 * Stateless controller for {@link BatchJobExecutionContext} conversation start.
 */
@Named
@Singleton
public class BatchJobExecutionContextController extends GenericController<BatchJobExecutionContext, Long> {
    public static final String BATCHJOBEXECUTIONCONTEXT_EDIT_URI = "/domain/batchJobExecutionContextEdit.faces";
    public static final String BATCHJOBEXECUTIONCONTEXT_SELECT_URI = "/domain/batchJobExecutionContextSelect.faces";

    @Inject
    public BatchJobExecutionContextController(BatchJobExecutionContextRepository batchJobExecutionContextRepository,
            BatchJobExecutionContextPermission batchJobExecutionContextPermission, BatchJobExecutionContextPrinter batchJobExecutionContextPrinter) {
        super(batchJobExecutionContextRepository, batchJobExecutionContextPermission, batchJobExecutionContextPrinter, BATCHJOBEXECUTIONCONTEXT_SELECT_URI,
                BATCHJOBEXECUTIONCONTEXT_EDIT_URI);
    }
}
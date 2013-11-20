/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-jsf2-spring-conversation:src/main/java/permission/Permission.e.vm.java
 */
package com.bazoud.springbatch.towns.webapp.web.permission;

import javax.inject.Named;
import javax.inject.Singleton;

import com.bazoud.springbatch.towns.webapp.domain.BatchStepExecution;
import com.bazoud.springbatch.towns.webapp.web.permission.support.GenericPermission;

@Named
@Singleton
public class BatchStepExecutionPermission extends GenericPermission<BatchStepExecution> {
    public BatchStepExecutionPermission() {
        super(BatchStepExecution.class);
    }
}
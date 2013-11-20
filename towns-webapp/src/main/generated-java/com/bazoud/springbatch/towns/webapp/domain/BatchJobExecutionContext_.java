/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-backend-jpa:src/main/java/domain/EntityMeta_.e.vm.java
 */
package com.bazoud.springbatch.towns.webapp.domain;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(BatchJobExecutionContext.class)
public abstract class BatchJobExecutionContext_ {

    // Raw attributes
    public static volatile SingularAttribute<BatchJobExecutionContext, Long> id;
    public static volatile SingularAttribute<BatchJobExecutionContext, String> shortContext;
    public static volatile SingularAttribute<BatchJobExecutionContext, String> serializedContext;

    // One to one
    public static volatile SingularAttribute<BatchJobExecutionContext, BatchJobExecution> batchJobExecution;
}
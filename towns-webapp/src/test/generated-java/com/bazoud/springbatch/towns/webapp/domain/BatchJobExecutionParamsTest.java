/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-backend-jpa:src/test/java/domain/ModelTest.e.vm.java
 */
package com.bazoud.springbatch.towns.webapp.domain;

import static org.fest.assertions.Assertions.assertThat;

import java.io.*;
import java.util.*;

import org.junit.Test;

import com.bazoud.springbatch.towns.webapp.util.ValueGenerator;

/**
 * Basic tests for BatchJobExecutionParams
 */
@SuppressWarnings("unused")
public class BatchJobExecutionParamsTest {

    // test unique primary key
    @Test
    public void newInstanceHasNoPrimaryKey() {
        BatchJobExecutionParams model = new BatchJobExecutionParams();
        assertThat(model.isIdSet()).isFalse();
    }

    @Test
    public void isIdSetReturnsTrue() {
        BatchJobExecutionParams model = new BatchJobExecutionParams();
        model.setId(ValueGenerator.getUniqueLong());
        assertThat(model.getId()).isNotNull();
        assertThat(model.isIdSet()).isTrue();
    }

    //-------------------------------------------------------------
    // Many to One:  BatchJobExecutionParams.batchJobExecution ==> BatchJobExecution.id
    //-------------------------------------------------------------

    @Test
    public void manyToOne_setBatchJobExecution() {
        BatchJobExecutionParams many = new BatchJobExecutionParams();

        // init
        BatchJobExecution one = new BatchJobExecution();
        one.setId(ValueGenerator.getUniqueLong());
        many.setBatchJobExecution(one);

        // make sure it is propagated properly
        assertThat(many.getBatchJobExecution()).isEqualTo(one);

        // now set it to back to null
        many.setBatchJobExecution(null);

        // make sure null is propagated properly
        assertThat(many.getBatchJobExecution()).isNull();
    }

    /*
     public void equalsUsingPk() {
     BatchJobExecutionParams model1 = new BatchJobExecutionParams();
     BatchJobExecutionParams model2 = new BatchJobExecutionParams();

     Long id = ValueGenerator.getUniqueLong();
     model1.setId(id);
     model2.setId(id);

     model1.setTypeCd("a");
     model2.setTypeCd("a");

     model1.setKeyName("a");
     model2.setKeyName("a");

     model1.setStringVal("a");
     model2.setStringVal("a");

     model1.setDateVal(new Date());
     model2.setDateVal(new Date());

     model1.setLongVal(1l);
     model2.setLongVal(1l);

     model1.setDoubleVal(1d);
     model2.setDoubleVal(1d);

     model1.setIdentifying("d");
     model2.setIdentifying("d");
     assertThat(model1.isIdSet()).isTrue();
     assertThat(model2.isIdSet()).isTrue();
     assertThat(model1.hashCode()).isEqualTo(model2.hashCode());
     assertThat(model1).isEqualTo(model2);
     assertThat(model2).isEqualTo(model1);
     }
     */
}
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
 * Basic tests for BatchJobInstance
 */
@SuppressWarnings("unused")
public class BatchJobInstanceTest {

    // test unique primary key
    @Test
    public void newInstanceHasNoPrimaryKey() {
        BatchJobInstance model = new BatchJobInstance();
        assertThat(model.isIdSet()).isFalse();
    }

    @Test
    public void isIdSetReturnsTrue() {
        BatchJobInstance model = new BatchJobInstance();
        model.setId(ValueGenerator.getUniqueLong());
        assertThat(model.getId()).isNotNull();
        assertThat(model.isIdSet()).isTrue();
    }

    @Test
    public void equalsUsingBusinessKey() {
        BatchJobInstance model1 = new BatchJobInstance();
        BatchJobInstance model2 = new BatchJobInstance();
        String jobName = "a";
        model1.setJobName(jobName);
        model2.setJobName(jobName);
        String jobKey = "a";
        model1.setJobKey(jobKey);
        model2.setJobKey(jobKey);
        assertThat(model1).isEqualTo(model2);
        assertThat(model2).isEqualTo(model1);
        assertThat(model1.hashCode()).isEqualTo(model2.hashCode());
    }
}
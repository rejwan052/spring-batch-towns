/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-selenium-primefaces:src/test/java/selenium/pages/entity/EditPage.e.vm.java
 */
package com.bazoud.springbatch.towns.webapp.web.selenium.page.batchstepexecutioncontext;

import com.bazoud.springbatch.towns.webapp.web.selenium.support.Page;
import com.bazoud.springbatch.towns.webapp.web.selenium.support.elements.CustomWebElement;
import com.bazoud.springbatch.towns.webapp.web.selenium.support.elements.EditAction;
import com.bazoud.springbatch.towns.webapp.web.selenium.support.elements.EntityAction;
import com.bazoud.springbatch.towns.webapp.web.selenium.support.elements.Messages;
import com.bazoud.springbatch.towns.webapp.web.selenium.support.elements.NoInverseOneToOne;
import com.bazoud.springbatch.towns.webapp.web.selenium.support.elements.StringInput;

@Page
public class BatchStepExecutionContextEdit {
    public EditAction action;
    public Messages messages;
    public EntityAction entity;
    public BatchStepExecutionContextEditForm form;
    public BatchStepExecutionContextEditTabs tabs;

    public static class BatchStepExecutionContextEditForm extends CustomWebElement {
        public StringInput shortContext = new StringInput("form:shortContext");
        public StringInput serializedContext = new StringInput("form:serializedContext");

        public NoInverseOneToOne batchStepExecution = new NoInverseOneToOne("form:batchStepExecution");
    };

    public static class BatchStepExecutionContextEditTabs extends CustomWebElement {
    };
}
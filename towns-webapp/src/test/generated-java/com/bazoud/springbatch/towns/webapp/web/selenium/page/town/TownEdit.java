/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-selenium-primefaces:src/test/java/selenium/pages/entity/EditPage.e.vm.java
 */
package com.bazoud.springbatch.towns.webapp.web.selenium.page.town;

import com.bazoud.springbatch.towns.webapp.web.selenium.support.Page;
import com.bazoud.springbatch.towns.webapp.web.selenium.support.elements.CustomWebElement;
import com.bazoud.springbatch.towns.webapp.web.selenium.support.elements.EditAction;
import com.bazoud.springbatch.towns.webapp.web.selenium.support.elements.EntityAction;
import com.bazoud.springbatch.towns.webapp.web.selenium.support.elements.IntegerInput;
import com.bazoud.springbatch.towns.webapp.web.selenium.support.elements.Messages;
import com.bazoud.springbatch.towns.webapp.web.selenium.support.elements.StringInput;

@Page
public class TownEdit {
    public EditAction action;
    public Messages messages;
    public EntityAction entity;
    public TownEditForm form;
    public TownEditTabs tabs;

    public static class TownEditForm extends CustomWebElement {
        public IntegerInput id = new IntegerInput("form:id");
        public StringInput department = new StringInput("form:department");
        public StringInput name = new StringInput("form:name");
        public StringInput nameReal = new StringInput("form:nameReal");
        public StringInput postcode = new StringInput("form:postcode");
        public IntegerInput population = new IntegerInput("form:population");
        public IntegerInput area = new IntegerInput("form:area");
        public StringInput longitudeDeg = new StringInput("form:longitudeDeg");
        public StringInput latitudeDeg = new StringInput("form:latitudeDeg");
        public StringInput longitudeGrd = new StringInput("form:longitudeGrd");
        public StringInput latitudeGrd = new StringInput("form:latitudeGrd");
        public StringInput longitudeDms = new StringInput("form:longitudeDms");
        public StringInput latitudeDms = new StringInput("form:latitudeDms");
        public IntegerInput zmin = new IntegerInput("form:zmin");
        public IntegerInput zmax = new IntegerInput("form:zmax");
    };

    public static class TownEditTabs extends CustomWebElement {
    };
}
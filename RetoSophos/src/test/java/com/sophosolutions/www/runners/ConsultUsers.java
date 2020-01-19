package com.sophosolutions.www.runners;

import static cucumber.api.SnippetType.CAMELCASE;

import cucumber.api.SnippetType;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/test/resources/features/consult_users.feature"},
        glue="com.sophosolutions.www.stepdefinitions",
        snippets= SnippetType.CAMELCASE)
public class ConsultUsers {

}

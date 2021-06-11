package com.sqa.demoguru.automations.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/register.feature",
        glue = "com.sqa.demoguru.automations.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class RegisterRunner {
}

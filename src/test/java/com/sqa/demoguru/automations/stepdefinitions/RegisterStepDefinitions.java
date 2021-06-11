package com.sqa.demoguru.automations.stepdefinitions;

import com.sqa.demoguru.automations.models.DataUser;
import com.sqa.demoguru.automations.task.OpenTheBrowser;
import com.sqa.demoguru.automations.task.Select;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.eo.Se;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class RegisterStepDefinitions {

    @Managed(driver = "chrome")
    private WebDriver hisBrowser; //se nombra como hisBrowser simplemente para hacer mas entendible el codigo

    private Actor janinson = Actor.named("janinson");

    @Before
    public void setUp() {
        janinson.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^that janinson wants to register on the page$")
    public void thatJaninsonWantsToRegisterOnThePage() {
        //precondiciones
        janinson.wasAbleTo(OpenTheBrowser.on());
        janinson.wasAbleTo(Select.theButtonRegister());
    }


    @When("^he  enters the personal information$")
    public void heEntersThePersonalInformation(List<DataUser> dataUserList) {
        //condiciones

    }

    @Then("^should see the welcome text in the screen$")
    public void shouldSeeTheWelcomeTextInTheScreen(List<DataUser> dataUsers) {
        //condiciones
    }
}

package net.serenitybdd.serenitycucumberthreads.stepDefinitions;

import net.serenitybdd.serenitycucumberthreads.steps.LoginLogoutSteps;
import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Steps;

public class LoginLogoutStepDefinitions {

    @Steps
    private LoginLogoutSteps loginLogoutSteps;


    //combined
    @Given("^open page$")
    public void registeredUserLogsInAs() throws Throwable {

        loginLogoutSteps.openLoginPage();
        Thread.sleep(5000);
        loginLogoutSteps.openLoginPage();
        Thread.sleep(5000);
        loginLogoutSteps.openLoginPage();
        Thread.sleep(5000);

    }

}
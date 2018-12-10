package net.serenitybdd.serenitycucumberthreads.steps;

import net.serenitybdd.serenitycucumberthreads.LoginPage;
import net.thucydides.core.annotations.Step;

@SuppressWarnings("FieldCanBeLocal")
public class LoginLogoutSteps {


    private LoginPage loginPage;


    @Step
    public void openLoginPage() {
        loginPage.open();
    }
}

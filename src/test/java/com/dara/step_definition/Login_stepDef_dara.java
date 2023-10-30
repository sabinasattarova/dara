package com.dara.step_definition;

import com.dara.pages.Login_page_dara;
import com.dara.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Login_stepDef_dara {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("Login to app in Before method");
    }


    Login_page_dara loginPage = new Login_page_dara();

    @When("user enters the {string} information")
    public void userEntersTheInformation(String userType) {
        loginPage.dynamicLogin(userType);
    }


    @Then("user is on Home page")
    public void userIsOnHomePage() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
        wait.until(ExpectedConditions.titleIs("Dashboard"));
        Assert.assertEquals("Dashboard", Driver.getDriver().getTitle());
    }
}

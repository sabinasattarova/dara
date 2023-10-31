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

    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String userType) {
        loginPage.dynamicLogin(userType);
    }


    @Then("user is on {string} page")
    public void userIsOnPage(String pageTitle) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
        wait.until(ExpectedConditions.titleIs(pageTitle));
        Assert.assertEquals(pageTitle, Driver.getDriver().getTitle());
    }
}

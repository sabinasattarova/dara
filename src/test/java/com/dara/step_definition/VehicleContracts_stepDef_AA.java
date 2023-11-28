package com.dara.step_definition;

import com.dara.pages.Home_driver_page_dara;
import com.dara.pages.Home_page_dara;
import com.dara.pages.VehicleContracts_page_AA;
import com.dara.utilities.BrowserUtils;
import com.dara.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class VehicleContracts_stepDef_AA {

    VehicleContracts_page_AA pageAA = new VehicleContracts_page_AA();
    //Home_page_dara homePageDara = new Home_page_dara();
   // Home_driver_page_dara homeDriverPageDara = new Home_driver_page_dara();

    @Then("verify Expected URL: {string}")
    public void verify_expected_url(String expectedURL) {
        BrowserUtils.sleep(5);
        Assert.assertEquals(expectedURL,Driver.getDriver().getCurrentUrl());



    }
    @Then("verify Expected title: {string}")
    public void verify_expected_title(String expectedTitle) {
        BrowserUtils.sleep(5);
        Assert.assertEquals(expectedTitle, Driver.getDriver().getTitle());

    }

    @Then("verify {string} error message is displayed")
    public void verifyErrorMessageIsDisplayed(String expectedErrorMessage) {
        Assert.assertTrue(pageAA.noPermissionErrorMessage.isDisplayed());

    }
}

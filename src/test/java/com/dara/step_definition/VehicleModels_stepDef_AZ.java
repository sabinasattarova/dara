package com.dara.step_definition;

import com.dara.pages.Home_driver_page_dara;
import com.dara.pages.Home_page_dara;
import com.dara.pages.VehicleModels_page_AZ;
import com.dara.utilities.BrowserUtils;
import com.dara.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class VehicleModels_stepDef_AZ {

    VehicleModels_page_AZ pageAz = new VehicleModels_page_AZ();
    Home_page_dara homePageDara = new Home_page_dara();

    Home_driver_page_dara homeDriverPageDara = new Home_driver_page_dara();

    @Then("verify user sees the following columns")
    public void verify_user_sees_the_following_columns(List<String> expectedColumns) {

        List<String> actualModules = new ArrayList<>();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(15));
        wait.until(ExpectedConditions.titleIs("All - Vehicles Model - Entities - System - Car - Entities - System"));

        for (WebElement eachModule : pageAz.vehicleModelsColumns) {
           actualModules.add(eachModule.getText());
        }

        Assert.assertEquals(expectedColumns,actualModules);

    }




    @And("user chooses {string} from Fleet drop-down as a driver")
    public void userChoosesFromFleetDropDownAsADriver(String dropdownOption) {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

        wait.until(ExpectedConditions.elementToBeClickable(homePageDara.fleetTab));

        homeDriverPageDara.chooseDropdownOption(homeDriverPageDara.fleetTab, homeDriverPageDara.fleetTabDropDown, dropdownOption);

    }
}

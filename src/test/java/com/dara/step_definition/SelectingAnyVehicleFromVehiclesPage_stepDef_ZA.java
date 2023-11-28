package com.dara.step_definition;

import com.dara.pages.Home_page_dara;
import com.dara.pages.Vehicles_page_ZA;
import com.dara.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SelectingAnyVehicleFromVehiclesPage_stepDef_ZA {

    Home_page_dara home_page_dara = new Home_page_dara();
    Vehicles_page_ZA vehicles_page_ZA = new Vehicles_page_ZA();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));


    @And("user chooses {string} page from Fleet drop-down")
    public void userChoosesPageFromFleetDropDown(String Vehicles) {


        wait.until(ExpectedConditions.elementToBeClickable(home_page_dara.fleetTab));

        home_page_dara.chooseDropdownOption(home_page_dara.fleetTab, home_page_dara.fleetTabDropDown, Vehicles);

    }

    // US7AC1
    @Then("user should see all the checkboxes are unchecked")
    public void user_should_see_all_the_checkboxes_are_unchecked() {

        //wait.until(ExpectedConditions.elementToBeClickable(vehicles_page_ZA.tableHeaderCheckbox));
        for (WebElement checkbox : vehicles_page_ZA.tableBodyCheckboxes){
            Assert.assertFalse(checkbox.isSelected());

        }


    }

    // US7AC2
    @Then("user checks the first checkbox")
    public void user_checks_the_first_checkbox() {

        vehicles_page_ZA.tableHeaderCheckbox.click();
        Assert.assertTrue(vehicles_page_ZA.tableHeaderCheckbox.isSelected());


    }

    @Then("user should see all the checkboxes are checked")
    public void user_should_see_all_the_checkboxes_are_checked() {

        for (WebElement checkbox : vehicles_page_ZA.tableBodyCheckboxes){
            Assert.assertTrue(checkbox.isSelected());

        }

    }


    // US7AC3
    @Then("user should be able to select any car")
    public void user_should_be_able_to_select_any_car() {

        for (WebElement checkbox : vehicles_page_ZA.tableBodyCheckboxes){
            checkbox.click();
            Assert.assertTrue(checkbox.isSelected());

        }
    }


}

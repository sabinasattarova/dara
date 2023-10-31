package com.dara.step_definition;

import com.dara.pages.Home_page_dara;
import com.dara.pages.Login_page_dara;
import com.dara.pages.Vehicle_cost_page_AB;
import com.dara.utilities.BrowserUtils;
import com.dara.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Vehicle_cost_stepDef_AB {

    Vehicle_cost_page_AB vehicleCostPage = new Vehicle_cost_page_AB();
    Login_page_dara loginPage = new Login_page_dara();
    Home_page_dara homePage = new Home_page_dara();


    @Then("the user selects Vehicle Cost from Fleet module")
    public void the_user_selects_vehicle_cost_from_fleet_module() {
        Actions actions = new Actions(Driver.getDriver());
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

        // Create an Actions object

        wait.until(ExpectedConditions.elementToBeClickable(homePage.fleetTab));
        // Hover over the element
        actions.moveToElement(homePage.fleetTab).perform();
        // click the element
        homePage.vehicleCosts.click();

    }
    @Then("the user should see the following column names")
    public void the_user_should_see_the_following_column_names(List<String> expectedColumns) {
        List<String> actualColumns = new ArrayList<>();
        for (WebElement eachColumn : vehicleCostPage.columns) {
            actualColumns.add(eachColumn.getText());

        }
     Assert.assertEquals(expectedColumns,actualColumns);
    }

    @And("users check the first checkbox to check all the Vehicle Costs")
    public void usersCheckTheFirstCheckboxToCheckAllTheVehicleCosts() {
        BrowserUtils.sleep(4);
      BrowserUtils.selectCheckBox(vehicleCostPage.typeCheckbox,true);

    }

    @Then("user should seethe  all the Vehicle Costs are checked")
    public void userShouldSeetheAllTheVehicleCostsAreChecked() {
        for (WebElement eachCheckBox : vehicleCostPage.vehicleCostCheckBoxes) {
            Assert.assertTrue(eachCheckBox.isSelected());
        }
    }
}

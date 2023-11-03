package com.dara.step_definition;

import com.dara.pages.Home_page_dara;
import com.dara.pages.VehicleModels_page_AZ;
import com.dara.utilities.BrowserUtils;
import com.dara.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Edit_car_info_icons_stepDef_SS {
    Home_page_dara homePage = new Home_page_dara();
    Actions action = new Actions(Driver.getDriver());

    VehicleModels_page_AZ vehiclesModel = new VehicleModels_page_AZ();

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));

    @Then("user chooses {string} from Fleet drop-down")
    public void user_chooses_from_fleet_drop_down(String dropdownOption) {

        wait.until(ExpectedConditions.elementToBeClickable(homePage.fleetTab));

       // homePage.chooseDropdownOption(homePage.marketingTab, homePage.marketingTabDropdown, "Campaigns");

      homePage.chooseDropdownOption(homePage.fleetTab, homePage.fleetTabDropDown, dropdownOption);

        //action.moveToElement(homePage.vehicleModelOption).pause(2000).click().perform();
    }
    @Then("user hovers over on three dots on car table line following options should appear")
    public void user_hovers_over_on_three_dots_on_car_table_line_following_options_should_appear(List<String> expectedEditOptions) {

        //Driver.actions().moveToElement(vehiclesModel.editDropdownDots).perform();

        List<String> dropdownOpt_as_STRING = new ArrayList<>();
        dropdownOpt_as_STRING.add(vehiclesModel.viewOpt.getAttribute("title"));
        dropdownOpt_as_STRING.add(vehiclesModel.editOpt.getAttribute("title"));
        dropdownOpt_as_STRING.add(vehiclesModel.deleteOpt.getAttribute("title"));

        System.out.println("dropdownOpt_as_STRING = " + dropdownOpt_as_STRING);

        for (WebElement each : vehiclesModel.getEditDropdownOpt()) {
            Assert.assertTrue(each.isDisplayed());
        }

        for (String eachExpectedOpt : expectedEditOptions) {
            //Assert.assertEquals(eachExpectedOpt, each.getAttribute("title"));
            break;
        }
    }
    @Then("user sees error msg {string}")
    public void user_sees_error_msg(String string) {

    }




}

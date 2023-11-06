package com.dara.step_definition;

import com.dara.pages.Home_driver_page_dara;
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
import java.util.List;

public class Edit_car_info_icons_stepDef_SS {
    Home_page_dara homePage = new Home_page_dara();
    VehicleModels_page_AZ vehiclesModel = new VehicleModels_page_AZ();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));
    Home_driver_page_dara driverHomePage = new Home_driver_page_dara();

    @Then("{string} chooses {string} from Fleet drop-down")
    public void chooses_from_fleet_drop_down(String userType, String dropdownOption) {

        BrowserUtils.waitForInvisibilityOf(Driver.getDriver().findElement(By.xpath("/html/body/div[4]/div")));

        switch (userType){
            case "driver":
                driverHomePage.chooseDropdownOption(driverHomePage.fleetTab, driverHomePage.fleetTabDropDown, dropdownOption);
                break;
            case "sales manager":
            case "store manager":
                homePage.chooseDropdownOption(homePage.fleetTab, homePage.fleetTabDropDown, dropdownOption);
        }

    }
    @Then("user hovers over on three dots on car table line following options should appear")
    public void user_hovers_over_on_three_dots_on_car_table_line_following_options_should_appear(List<String> editOptions) {

        //Driver.actions().moveToElement(vehiclesModel.editDropdownDots).perform();
        BrowserUtils.hover(vehiclesModel.editDropdownDots);
       // System.out.println("vehiclesModel.getEditDropdownOpt() = " + vehiclesModel.getEditDropdownOpt_as_STRING());

        Assert.assertEquals(editOptions, vehiclesModel.getEditDropdownOpt_as_STRING());
    }
    @Then("user sees error msg {string}")
    public void user_sees_error_msg(String errorMsg) {

        Assert.assertTrue(driverHomePage.error_msg_restriction_to_access_vehicles_model_page.isDisplayed());

        Assert.assertEquals(errorMsg, driverHomePage.error_msg_restriction_to_access_vehicles_model_page.getText());

    }




}

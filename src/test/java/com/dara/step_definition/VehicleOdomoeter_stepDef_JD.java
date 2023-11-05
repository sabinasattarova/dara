package com.dara.step_definition;

import com.dara.pages.Home_driver_page_dara;
import com.dara.pages.Home_page_dara;
import com.dara.pages.VehicleOdomoeter_page_JD;
import com.dara.utilities.BrowserUtils;
import com.dara.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

public class VehicleOdomoeter_stepDef_JD {
    Home_page_dara homePageDara = new Home_page_dara();
    Home_driver_page_dara homeDriverPageDara = new Home_driver_page_dara();
    VehicleOdomoeter_page_JD vehicleOdomoeterPageJd = new VehicleOdomoeter_page_JD();

    @And("user chooses Vehicles Odometer from Fleet drop-down")
    public void userChoosesVehiclesOdometerFromFleetDropDown() {

        BrowserUtils.waitForInvisibilityOf(Driver.getDriver().findElement(By.xpath("/html/body/div[4]/div")));
         try{
       homePageDara.fleetTab.click();
         }catch (NullPointerException e){homePageDara.fleetTab.click();}
        vehicleOdomoeterPageJd.vehicleOdometer.click();

    }

    @Then("user see an error message {string}")
    public void user_see_an_error_message(String expectedErrorMessage) {
        BrowserUtils.waitForInvisibilityOf(Driver.getDriver().findElement(By.xpath("/html/body/div[4]/div")));

        String actualErrorMessage = vehicleOdomoeterPageJd.errorMessage.getText();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);

    }

    @Then("the driver should see that the default page is set to {string}")
    public void theDriverShouldSeeThatTheDefaultPageIsSetTo(String expectedPageNumber) {
        BrowserUtils.waitForInvisibilityOf(Driver.getDriver().findElement(By.xpath("/html/body/div[4]/div")));
        BrowserUtils.sleep(2);
        String actualPageNumber = vehicleOdomoeterPageJd.pageNumber.getAttribute("value");
        Assert.assertEquals(expectedPageNumber, actualPageNumber);
    }

    @Then("the driver should see that the View Per Page option is set to {string}")
    public void theDriverShouldSeeThatTheViewPerPageOptionIsSetTo(String expectedPagesPerPage) {
        String actualPagesPerPage = vehicleOdomoeterPageJd.numberPerPages.getText();
        Assert.assertEquals(expectedPagesPerPage, actualPagesPerPage);
    }


    @And("driver chooses Vehicles Odometer from Fleet drop-down")
    public void driverChoosesVehiclesOdometerFromFleetDropDown() {
        BrowserUtils.waitForInvisibilityOf(Driver.getDriver().findElement(By.xpath("/html/body/div[4]/div")));
     homeDriverPageDara.fleetTab.click();
        vehicleOdomoeterPageJd.driverfleetOdometer.click();


      /*  try{
            homePageDara.fleetTab.click();
        }catch (NullPointerException e){homePageDara.fleetTab.click();}
        vehicleOdomoeterPageJd.driverfleetOdometer.click();*/
    }
}

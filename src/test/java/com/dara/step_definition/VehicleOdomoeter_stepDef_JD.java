package com.dara.step_definition;

import com.dara.pages.Home_page_dara;
import com.dara.pages.VehicleOdomoeter_page_JD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class VehicleOdomoeter_stepDef_JD {
    Home_page_dara homePageDara = new Home_page_dara();

    VehicleOdomoeter_page_JD vehicleOdomoeterPageJd = new VehicleOdomoeter_page_JD();

    @Then("user see an error message {string}")
    public void user_see_an_error_message(String expectedErrorMessage) {
        String actualErrorMessage = vehicleOdomoeterPageJd.errorMessage.getText();
        Assert.assertEquals(expectedErrorMessage,actualErrorMessage);

    }



    @Then("the driver should see that the default page is set to {string}")
    public void theDriverShouldSeeThatTheDefaultPageIsSetTo(String expectedPageNumber) {
        String actualPageNumber = vehicleOdomoeterPageJd.pageNumber.getText();
        Assert.assertEquals(expectedPageNumber,actualPageNumber);
    }

    @Then("the driver should see that the View Per Page option is set to {string}")
    public void theDriverShouldSeeThatTheViewPerPageOptionIsSetTo(String expectedPagesPerPage) {
        String actualPagesPerPage = vehicleOdomoeterPageJd.numberPerPages.getText();
        Assert.assertEquals(expectedPagesPerPage,actualPagesPerPage);
    }

   /* @And("user chooses {string} from Fleet tab")
    public void userChoosesFromFleetTab(String FleetTab) {
        homePageDara.fleetTab.click();



    }*/
}

package com.dara.step_definition;

import com.dara.pages.CalendarEvents_page_KV;
import com.dara.pages.Home_driver_page_dara;
import com.dara.pages.Home_page_dara;
import com.dara.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class DescriptionField_stepDef_SA {

    CalendarEvents_page_KV calendarDescription = new CalendarEvents_page_KV();
    Home_driver_page_dara driverPageDara = new Home_driver_page_dara();
    Home_page_dara homepage = new Home_page_dara();

    @Then("user clicks on the description area")
    public void userClicksOnTheDescriptionArea() {
        calendarDescription.descriptionArea.click();
    }

    @And("user inputs a {string} in the description area")
    public void userInputsAInTheDescriptionArea(String message) {
        calendarDescription.descriptionArea.sendKeys(message);
        String description = calendarDescription.descriptionArea.getAttribute("value");
        Assert.assertEquals(message, description);
        calendarDescription.descriptionArea.isDisplayed();
    }
}
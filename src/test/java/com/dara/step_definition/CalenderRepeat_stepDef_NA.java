package com.dara.step_definition;

import com.dara.pages.CalendarEventsRepeat_page_NA;
import com.dara.pages.CalendarEvents_page_KV;
import com.dara.pages.Home_driver_page_dara;
import com.dara.pages.Home_page_dara;
import com.dara.utilities.BrowserUtils;
import com.dara.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class CalenderRepeat_stepDef_NA {

    //CalendarEventsRepeat_page_NA calendarRepeat = new CalendarEventsRepeat_page_NA();
    CalendarEvents_page_KV calendarRepeat = new CalendarEvents_page_KV();
    Home_driver_page_dara driverPageDara = new Home_driver_page_dara();
    Home_page_dara homepage = new Home_page_dara();

    @And("user sees 1 by default in the Repeat Every input")
    public void user_sees_1_by_default_in_the_Repeat_Every_input() {
        String repeatEveryInput = calendarRepeat.repeatEveryInputBox.getAttribute("value");
        Assert.assertEquals("1", repeatEveryInput);
    }
    @Then("user clears event repeat field")
    public void userClearsEventRepeatField() {
        calendarRepeat.repeatEveryInputBox.clear();
    }
    @Then("user sees an error message This value should not be blank.")
    public void userSeesAnErrorMessageThisValueShouldNotBeBlank() {
      Assert.assertEquals("This value should not be blank.", calendarRepeat.clearedErrorMessage.getText());
    }
//    @Then("user clicks on Calendar Events")
//    public void userClicksOnCalendarEvents() {
//        try {
//            calendarRepeat.calendarEvents.click();
//        } catch (RuntimeException e) {
//            calendarRepeat.calendarEvents.click();
//        }
//    }
//    @Then("user clicks Create Calendar Event")
//    public void userClicksCreateCalendarEvent() {
//        try {
//            calendarRepeat.createCalenderEvent.click();
//        } catch (RuntimeException e) {
//            calendarRepeat.createCalenderEvent.click();
//        }
//    }
//    @Then("user clicks Repeat checkbox")
//    public void userClicksRepeatCheckbox() {
//        try {
//            calendarRepeat.repeatBox.click();
//        } catch (RuntimeException e) {
//            calendarRepeat.repeatBox.click();
//        }
//    }




}

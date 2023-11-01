package com.dara.step_definition;

import com.dara.pages.CalendarEvents_page_KV;
import com.dara.pages.Home_driver_page_dara;
import io.cucumber.java.en.Then;

public class RepeatDayErrorMessage_stepDef_KV {

    CalendarEvents_page_KV calendarEvents = new CalendarEvents_page_KV();
    Home_driver_page_dara driverPageDara = new Home_driver_page_dara();


    @Then("user clicks on Activities")
    public void user_clicks_on_activities() {

        calendarEvents.activitiesTab.click();

    }
    @Then("user clicks on Calendar Events")
    public void user_clicks_on_calendar_events() {

        calendarEvents.calendarEventsTab.click();

    }
    @Then("user clicks on Create Calendar Event")
    public void user_clicks_on_create_calendar_event() {

        calendarEvents.createCalenderEventTab.click();

    }
    @Then("user clicks on Repeat checkbox")
    public void user_clicks_on_repeat_checkbox() {

        calendarEvents.repeatCheckBox.click();

    }
    @Then("user enters integer less than {int}")
    public void userEntersIntegerLessThan(int negativeNumber) {

        calendarEvents.repeatEveryInputBox.sendKeys(""+negativeNumber);

    }

    @Then("user enters integer more than {int}")
    public void userEntersIntegerMoreThan(int NumberOver100) {

        calendarEvents.repeatEveryInputBox.sendKeys(""+NumberOver100);

    }

    @Then("user views The value have not to be less than {int} error message")
    public void user_views_the_value_have_not_to_be_less_than_error_message(Integer int1) {

        calendarEvents.LessThan1ErrorMessage.isDisplayed();

    }

    @Then("user views The value have not to be more than {int} error message")
    public void user_views_the_value_have_not_to_be_more_than_error_message(Integer int1) {

        calendarEvents.MoreThan99ErrorMessage.isDisplayed();

    }


}

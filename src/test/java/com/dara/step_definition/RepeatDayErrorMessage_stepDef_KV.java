package com.dara.step_definition;

import com.dara.pages.CalendarEvents_page_KV;
import com.dara.pages.Home_driver_page_dara;
import com.dara.pages.Home_page_dara;
import com.dara.utilities.BrowserUtils;
import com.dara.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class RepeatDayErrorMessage_stepDef_KV {

    CalendarEvents_page_KV calendarEvents = new CalendarEvents_page_KV();
    Home_driver_page_dara driverPageDara = new Home_driver_page_dara();
    Home_page_dara homepage = new Home_page_dara();



    @Then("user clicks on Create Calendar Event")
    public void user_clicks_on_create_calendar_event() {

        BrowserUtils.waitForInvisibilityOf(Driver.getDriver().findElement(By.xpath("/html/body/div[4]/div")));
        try {
            calendarEvents.createCalenderEventTab.click();
        }catch (NullPointerException e){
            calendarEvents.createCalenderEventTab.click();
        }

    }
    @Then("user clicks on Repeat checkbox")
    public void user_clicks_on_repeat_checkbox() {

        calendarEvents.repeatCheckBox.click();

    }
    @Then("user enters integer less than {int}")
    public void userEntersIntegerLessThan(int negativeNumber) {

        calendarEvents.repeatEveryInputBox.clear();
        calendarEvents.repeatEveryInputBox.sendKeys(""+negativeNumber);
        calendarEvents.LessThan1ErrorMessage.isDisplayed();

    }

    @Then("user enters integer more than {int}")
    public void userEntersIntegerMoreThan(int NumberOver100) {

        calendarEvents.repeatEveryInputBox.clear();
        calendarEvents.repeatEveryInputBox.sendKeys(""+NumberOver100);
        calendarEvents.MoreThan99ErrorMessage.isDisplayed();

    }

    @Then("user views The value have not to be less than {int} error message")
    public void user_views_the_value_have_not_to_be_less_than_error_message(Integer int1) {

        calendarEvents.LessThan1ErrorMessage.isDisplayed();

    }

    @Then("user views The value have not to be more than {int} error message")
    public void user_views_the_value_have_not_to_be_more_than_error_message(Integer int1) {

        calendarEvents.MoreThan99ErrorMessage.isDisplayed();

    }


    @Then("{string} clicks on Activities")
    public void clicksOnActivities(String userType) {
        if (userType.equalsIgnoreCase("driver")){
            driverPageDara.chooseDropdownOption(driverPageDara.activitiesTab, driverPageDara.activitiesTabDropDown,"Calendar Events");
        }else{
            homepage.chooseDropdownOption(homepage.activitiesTab, homepage.activitiesTabDropDown,"Calendar Events");
        }
    }
}

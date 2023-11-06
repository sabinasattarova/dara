package com.dara.step_definition;

import com.dara.pages.CalendarEvents_page_KV;
import com.dara.pages.Home_driver_page_dara;
import com.dara.pages.Home_page_dara;
import com.dara.utilities.BrowserUtils;
import com.dara.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

public class DescriptionField_stepDef_SA {

    CalendarEvents_page_KV calendarDescription = new CalendarEvents_page_KV();
    Home_driver_page_dara driverPageDara = new Home_driver_page_dara();
    Home_page_dara homepage = new Home_page_dara();


    @And("user inputs a {string} in the description area")
    public void userInputsAInTheDescriptionArea(String message) {

        BrowserUtils.waitForInvisibilityOf(Driver.getDriver().findElement(By.xpath("/html/body/div[4]/div")));

        BrowserUtils.waitForVisibility(calendarDescription.descriptionIframe, 20);

        Driver.getDriver().switchTo().frame(calendarDescription.descriptionIframe);

        calendarDescription.descriptionArea.click();

        calendarDescription.descriptionArea.sendKeys(message);
        BrowserUtils.sleep(2);
        String description = calendarDescription.descriptionAreaText.getText();
        Assert.assertEquals(message, description);

        calendarDescription.descriptionAreaText.isDisplayed();
    }
}
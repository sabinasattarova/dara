package com.dara.pages;

import com.dara.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarEventsRepeat_page_NA {

    public CalendarEventsRepeat_page_NA() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//*[@id=\"main-menu\"]/ul/li[3]/div/div/ul/li[3]/a/span")
    public WebElement calendarEvents;

    @FindBy (xpath = "//*[@id=\"container\"]/div[2]/div/div/div[2]/div/a")
    public WebElement createCalenderEvent;

    @FindBy (xpath = "//*[contains(@id,'recurrence-repeat-view')]")
    public WebElement repeatBox;

    @FindBy(xpath = "//*[@id=\"oro_calendar_event_form-uid-6546962b0b0ad\"]/div[2]/div[2]/div/div[1]/div[2]/div/fieldset/div[2]/div[2]/div[2]/div[2]/div/div/div[2]/div[1]/label/input[3]")
    public WebElement repeatEveryBox;

    @FindBy(xpath = "//*[@id=\"temp-validation-name-358-error\"]/span/span")
    public WebElement clearedErrorMessage;


}

package com.dara.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalendarEvents_page_KV {

    @FindBy(xpath = "//*[@id=\"container\"]/div[2]/div/div/div[2]/div/a")
    public WebElement createCalenderEventTab;

    @FindBy(xpath = "//input[@id='recurrence-repeat-view397']")
    public WebElement repeatCheckBox;

    @FindBy(xpath = "//*[@id=\"oro_calendar_event_form-uid-6541b204b8380\"]/div[2]/div[2]/div/div[1]/div[2]/div/fieldset/div[2]/div[2]/div[2]/div[2]/div/div/div[2]/div[1]/label/input[3]")
    public WebElement repeatEveryInputBox;

    @FindBy(xpath = "//*[@id=\"temp-validation-name-264-error\"]/span/span")
    public WebElement LessThan1ErrorMessage;

    @FindBy(xpath = "//*[@id=\"temp-validation-name-264-error\"]/span/span")
    public WebElement MoreThan99ErrorMessage;
}

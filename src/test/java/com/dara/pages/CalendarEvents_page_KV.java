package com.dara.pages;

import com.dara.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarEvents_page_KV {

    public CalendarEvents_page_KV (){
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//*[@id=\"container\"]/div[2]/div/div/div[2]/div")
    public WebElement createCalenderEventTab;

    @FindBy(xpath = "//*[contains(@id,'recurrence-repeat-view')]")
    public WebElement repeatCheckBox;

    @FindBy(xpath = "//label[@data-role='control-section-switcher']/input[@value='1']")
    public WebElement repeatEveryInputBox;

    @FindBy(xpath = "//*[.='The value have not to be less than 1.']")
    public WebElement LessThan1ErrorMessage;

    @FindBy(xpath = "//*[.='The value have not to be more than 99.']")
    public WebElement MoreThan99ErrorMessage;
}

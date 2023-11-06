package com.dara.pages;

import com.dara.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarEvents_page_KV {

    public CalendarEvents_page_KV (){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[normalize-space(text())='Create Calendar event']")
    public WebElement createCalenderEventTab;

    @FindBy(xpath = "(//div[@class='responsive-cell responsive-cell-no-blocks'])[2]/div[2]/div/div[@class='controls']/input")
    public WebElement repeatCheckBox;

    @FindBy(xpath = "//label[@data-role='control-section-switcher']/input[@value='1']")
    public WebElement repeatEveryInputBox;

    @FindBy(xpath = "//*[.='The value have not to be less than 1.']")
    public WebElement LessThan1ErrorMessage;

    @FindBy(xpath = "//*[.='The value have not to be more than 99.']")
    public WebElement MoreThan99ErrorMessage;

    @FindBy(xpath = "//*[@id=\"temp-validation-name-358-error\"]/span/span")
    public WebElement clearedErrorMessage;

    @FindBy(xpath = "//*[@id=\"tinymce\"]")
    public WebElement descriptionArea;

    @FindBy(xpath = "//iframe")
    public WebElement descriptionIframe;

    @FindBy(xpath = "//*[@id=\"tinymce\"]/p")
    public WebElement descriptionAreaText;

}
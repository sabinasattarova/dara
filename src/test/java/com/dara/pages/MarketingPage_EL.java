package com.dara.pages;

import com.dara.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MarketingPage_EL {

    public MarketingPage_EL(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[.='Manage filters']/..")
    public WebElement manageFiltersButton;

    @FindBy(xpath = "//a[@title='Filters']")
    public WebElement filtersButton;

    @FindBy(xpath = "//input[@title='Name']")
    public WebElement nameCheckBox;

    @FindBy(xpath = "//input[@title='Code']")
    public WebElement codeCheckBox;

    @FindBy(xpath = "//input[@title='Start Date']")
    public WebElement startDateCheckBox;

    @FindBy(xpath = "//input[@title='End Date']")
    public WebElement endDateCheckBox;

    @FindBy(xpath = "//input[@title='Budget']")
    public WebElement budgetCheckBox;

    @FindAll({
            @FindBy(xpath = "//input[@title='Budget']"),
            @FindBy(xpath = "//input[@title='End Date']"),
            @FindBy(xpath = "//input[@title='Start Date']"),
            @FindBy(xpath = "//input[@title='Code']"),
            @FindBy(xpath = "//input[@title='Name']")
    })
    public List<WebElement> actualFilterOptions;

    /*public void clickCheckBox(WebElement checkbox){
        checkbox.click();
    }*/

    public boolean checkIfChecked(WebElement checkbox){
        return checkbox.isSelected();
    }




}

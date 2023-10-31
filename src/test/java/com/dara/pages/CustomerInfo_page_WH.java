package com.dara.pages;

import com.dara.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerInfo_page_WH {

    public CustomerInfo_page_WH() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


@FindBy(xpath = "(//span[contains (text(),'Customers')])[1]")
public WebElement customersElement;


@FindBy (linkText = "/account")
public WebElement accountElement;

@FindBy(xpath = "//i[@class='fa-filter hide-text']")
    public WebElement filterElement;

@FindBy(xpath = "//select[@data-action='add-filter-select']")
    public WebElement listOfAccount;



//  (xpath = "(//a[@href='/account'])[1]")




















}

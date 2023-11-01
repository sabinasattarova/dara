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


@FindBy (xpath = "//*[@id=\"main-menu\"]/ul/li[3]/div/div/ul/li[3]/a/span") //(xpath = "(//a[@href='/account'])[1]")
public WebElement accountElement;


@FindBy(xpath = "//a[@title='Filters']")
public WebElement filterElement;

@FindBy(xpath = "//select[@data-action='add-filter-select']")
    public WebElement listOfAccount;



//(linkText = "/account")




















}

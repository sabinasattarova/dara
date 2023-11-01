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

@FindBy(xpath = "//*[@id=\"grid-accounts-grid-1120613503\"]/div[2]/div[1]/div/div[3]/div[1]/div/a[1]/i")
    public WebElement filterElement;

@FindBy(xpath = "//select[@data-action='add-filter-select']")
    public WebElement listOfAccount;



//(linkText = "/account")




















}

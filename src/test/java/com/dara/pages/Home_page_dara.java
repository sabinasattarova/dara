package com.dara.pages;

import com.dara.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page_dara {

    public Home_page_dara(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@href='/campaign/']/span/..")
    public WebElement marketingPage;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[6]")
    public WebElement marketingTab;


}

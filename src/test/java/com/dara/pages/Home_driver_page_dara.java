package com.dara.pages;

import com.dara.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_driver_page_dara {

    //for driver user home page POM

    public Home_driver_page_dara(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[3]")
    public WebElement activitiesTab;

    @FindBy(xpath = "(//span[@class='title title-level-2'])[9]")
    public WebElement calendarEventsTab;
}

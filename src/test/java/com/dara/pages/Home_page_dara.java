package com.dara.pages;

import com.dara.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Home_page_dara {

    // for store manager and sales manager users POM

    public Home_page_dara(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//ul[@class='nav-multilevel main-menu']/li[2]//ul")
    public List<WebElement> fleetTabDropDown;


    @FindBy(xpath="(//span[@class='title title-level-1'])[2]")
    public WebElement Fleet;

    @FindBy(xpath="//span[.='Vehicle Costs']")
    public WebElement VehicleCosts;
}

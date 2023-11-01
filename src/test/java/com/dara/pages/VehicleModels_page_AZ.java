package com.dara.pages;

import com.dara.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class VehicleModels_page_AZ {

    public VehicleModels_page_AZ() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy (xpath = "//thead[@class='grid-header']//span[@class='grid-header-cell__label']")
    public List<WebElement> vehicleModelsColumns;

    @FindBy (xpath = "//div[.='You do not have permission to perform this action.']")
    public WebElement noPermissionErrorMessage;

    @FindBy(xpath = "//tbody[@class='grid-body']/tr[1]//div[@class='more-bar-holder']/div")
    public WebElement editDropdownDots;

    @FindBy(xpath = "//tbody[@class='grid-body']/tr[1]//div[@class='more-bar-holder']/div//li[@class='launcher-item']")
    public List<WebElement> viewEditDeleteOpt;


}

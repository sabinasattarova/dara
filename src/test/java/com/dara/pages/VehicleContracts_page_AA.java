package com.dara.pages;

import com.dara.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleContracts_page_AA {
    public VehicleContracts_page_AA() {
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//span[.='Vehicle Contracts']")
    public WebElement vehicleContracts;

    @FindBy(xpath = "//div[@class='message']")
    public WebElement noPermissionErrorMessage;


}

package com.dara.pages;
import com.dara.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleOdomoeter_page_JD {

    public VehicleOdomoeter_page_JD(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//div[text()='You do not have permission to perform this action.']")
    public WebElement errorMessage;

    @FindBy (xpath = "//input[@value='1']")
    public WebElement pageNumber;

    @FindBy (xpath = "//button[@class='btn dropdown-toggle ']")
    public WebElement numberPerPages;


    @FindBy(xpath = "")
    public WebElement vehicleOdometer;






}

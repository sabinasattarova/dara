package com.dara.pages;

import com.dara.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class Home_page_dara {

    public Home_page_dara(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@href='/campaign/']/span/..")
    public WebElement marketingPage;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[6]")
    public WebElement marketingTab;

    @FindBy(xpath = "//ul[@class='nav-multilevel main-menu']/li")
    public List<WebElement> allModules;


    // for store manager and sales manager users POM


    @FindBy(xpath = "(//ul[@class='nav-multilevel main-menu']/li)[2]")
    public WebElement fleetTab;

    @FindBy(xpath = "//ul[@class='nav-multilevel main-menu']/li[2]//li[9]")
    public WebElement vehicleModelOption;

    @FindBy(xpath = "//ul[@class='nav-multilevel main-menu']/li[2]//ul/li")
    public List<WebElement> fleetTabDropDown;


    //span[.='Vehicle Costs']
    @FindBy(xpath = "//span[.='Vehicle Costs']")
    public WebElement vehicleCosts;

    /**
     * This method will click on "Option" that you specify if you provide following parameters:
     * @param menuTab -> WebElement location that in on menu bar
     * @param listOfDropdownOptions -> List<WebELement> all Dropdown Options
     * @param optionToBeChosen -> which of the options you want to be chosen
     */
    public void chooseDropdownOption(WebElement menuTab, List<WebElement> listOfDropdownOptions, String optionToBeChosen){
        Actions action = new Actions(Driver.getDriver());

        action.moveToElement(menuTab).pause(2000).perform();

        for (WebElement each : listOfDropdownOptions) {
            //System.out.println("each.getText() = " + each.getText());
            if (each.getText().equals(optionToBeChosen)){
                action.moveToElement(each).pause(2000).click().perform();
                break;
            }
        }
    }

}

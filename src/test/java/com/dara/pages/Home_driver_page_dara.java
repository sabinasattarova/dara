package com.dara.pages;

import com.dara.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Home_driver_page_dara {

    //for driver user home page POM

    public Home_driver_page_dara(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//ul[@class='nav-multilevel main-menu']/li[1]//ul/li")
    public List<WebElement> fleetTabDropDown;


    @FindBy(xpath = "(//ul[@class='nav-multilevel main-menu']/li)[1]")
    public WebElement fleetTab;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[3]")
    public WebElement activitiesTab;

    @FindBy(xpath = "(//span[@class='title title-level-2'])[9]")
    public WebElement calendarEventsTab;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[3]//ul/li")
    public List<WebElement> activitiesTabDropDown;

    @FindBy(xpath = "//div[.='You do not have permission to perform this action.']")
    public WebElement error_msg_restriction_to_access_vehicles_model_page;

    @FindBy(xpath = "//ul[@class='nav-multilevel main-menu']/li")
    public List<WebElement> menuBarOpts;










    public void chooseDropdownOption(WebElement menuTab, List<WebElement> listOfDropdownOptions, String optionToBeChosen){
        Actions action = new Actions(Driver.getDriver());

        action.moveToElement(menuTab).pause(1000).perform();

        for (WebElement each : listOfDropdownOptions) {
          //  System.out.println("each.getText() = " + each.getText());
            if (each.getText().equals(optionToBeChosen)){
                action.moveToElement(each).pause(1000).click().perform();
                break;
            }
        }
    }


}

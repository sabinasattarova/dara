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

    public void chooseDropdownOption(WebElement menuTab, List<WebElement> listOfDropdownOptions, String optionToBeChosen){
        Actions action = new Actions(Driver.getDriver());

        action.moveToElement(menuTab).pause(2000).perform();

        for (WebElement each : listOfDropdownOptions) {
            System.out.println("each.getText() = " + each.getText());
            if (each.getText().equals(optionToBeChosen)){
                action.moveToElement(each).pause(2000).click().perform();
                break;
            }
        }
    }

}

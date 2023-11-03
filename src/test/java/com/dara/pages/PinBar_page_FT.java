package com.dara.pages;

import com.dara.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PinBar_page_FT {

    public PinBar_page_FT() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy (xpath = "//a[text()='Learn how to use this space']")
    public WebElement LearnHowToUseThisSpaceLink;


    @FindBy (xpath ="//h3[text()='How To Use Pinbar']")
    public WebElement heading;

    @FindBy (xpath = "//p[contains(text(),' Use pin icon')]")
    public WebElement instructions;


    @FindBy (xpath =  "//img[@src='/bundles/oronavigation/images/pinbar-location.jpg']")
            public WebElement pinbar;




    //  "//img[@src='/bundles/oronavigation/images/pinbar-location.jpg']")
  //(xpath = "//*[@id=\"container\"]/div[2]/div/p[1]/text()")
















}

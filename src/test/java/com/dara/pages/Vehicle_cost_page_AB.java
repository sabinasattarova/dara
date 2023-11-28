package com.dara.pages;

import com.dara.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Vehicle_cost_page_AB {

    public Vehicle_cost_page_AB(){
        PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "//span[.='Type']")
    public WebElement vehicleCosts;


    @FindBy(xpath = "//tr[@class='grid-row row-click-action']/td/input")
    public List<WebElement> vehicleCostCheckBoxes;


    @FindBy(xpath = "//a[@class='grid-header-cell__link']")
    public List<WebElement> columns;


    @FindBy(xpath = "//button[@class='btn btn-default btn-small dropdown-toggle']//input")
    public WebElement typeCheckbox;



}

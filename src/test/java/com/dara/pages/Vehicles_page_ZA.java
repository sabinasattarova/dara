package com.dara.pages;

import com.dara.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Vehicles_page_ZA {

    public Vehicles_page_ZA() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//thead//button[@class= 'btn btn-default btn-small dropdown-toggle']//input")
    public WebElement tableHeaderCheckbox;


    @FindBy(xpath = "//table[@class= 'grid table-hover table table-bordered table-condensed']//tbody/tr/td[1]/input")
    public List<WebElement>  tableBodyCheckboxes;

}

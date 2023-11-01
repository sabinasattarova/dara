package com.dara.pages;

import com.dara.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OronicDocWindow_page_WH {
    public OronicDocWindow_page_WH() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//i[@title='Get help']")
    public WebElement questionMark;






















}

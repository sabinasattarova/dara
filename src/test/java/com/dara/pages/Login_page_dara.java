package com.dara.pages;

import com.dara.utilities.ConfigReader;
import com.dara.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page_dara {

    public Login_page_dara(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="prependedInput")
    public WebElement userName;



    @FindBy(id="prependedInput2")
    public WebElement password;

    @FindBy(name = "_submit")
    public WebElement submit;


    public void login(String userNameStr, String passwordStr) {
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        submit.click();
        // verification that we logged
    }

    public void dynamicLogin(String userType){ // String userType="sales manager" is coming from parameterization

        userType = userType.replace(" ","_"); // userType = "sales_manager"
        String username = ConfigReader.getProperty(userType + "_username"); // username = "sales_manager_username"
        String password = ConfigReader.getProperty(userType + "_password"); // password = "sales_manager_password"

        login(username,password);

    }
}

package com.dara.step_definition;

import com.dara.pages.Login_page_dara;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Login_stepDef_dara {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("Login to app in Before method");
    }


    Login_page_dara loginPage = new Login_page_dara();

    @When("user enters the {string} information")
    public void userEntersTheInformation(String userType) {
        loginPage.dynamicLogin(userType);
    }

}

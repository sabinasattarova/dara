package com.dara.step_definition;

import com.dara.pages.CustomerInfo_page_WH;
import com.dara.utilities.BrowserUtils;
import com.dara.utilities.Driver;
import com.google.common.base.Strings;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class CustomerInfo_stepDef_WH {

    CustomerInfo_page_WH customerInfo = new CustomerInfo_page_WH();


    @Then("user clicks on the Customers")
    public void user_clicks_on_the_customers() {
        customerInfo.customersElement.click();

    }
    @Then("user clicks on the Accounts")
    public void user_clicks_on_the_accounts() {
        BrowserUtils.hover(customerInfo.accountElement);
    }



    @Then("user clicks filter button")
    public void user_clicks_filter_button() {
        customerInfo.filterElement.click();

    }
    @Then("user sees eight filter items")
    public void user_sees_eight_filter_items(List<Strings> expectedListOfAccount) {
        Select accounts = new Select(customerInfo.listOfAccount);
        List <WebElement> actualListofAccount_WebElement = accounts.getOptions();
        List <String> actualListofAccount_String = new ArrayList<>();
        for (WebElement eachWebElement : actualListofAccount_WebElement) {
            actualListofAccount_String.add(eachWebElement.getText());

        }
        Assert.assertEquals(expectedListOfAccount,actualListofAccount_String);





    }


















}

package com.dara.step_definition;

import com.dara.pages.CustomerInfo_page_WH;
import com.dara.utilities.BrowserUtils;
import com.dara.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class CustomerInfo_stepDef_WH {

    CustomerInfo_page_WH customerInfo = new CustomerInfo_page_WH();


    @Then("user clicks on the Customers")
    public void user_clicks_on_the_customers() {
     BrowserUtils.waitForInvisibilityOf(Driver.getDriver().findElement(By.xpath("/html/body/div[4]/div")));
        customerInfo.customersElement.click();

    }
    @Then("user clicks on the Accounts")
    public void user_clicks_on_the_accounts() {
        Actions actions = new Actions(Driver.getDriver());
        BrowserUtils.waitForInvisibilityOf(Driver.getDriver().findElement(By.xpath("/html/body/div[4]/div")));
        actions.moveToElement(customerInfo.accountElement).perform();
        customerInfo.accountElement.click();


   /*BrowserUtils.waitForInvisibilityOf(Driver.getDriver().findElement(By.xpath("/html/body/div[4]/div")));
        BrowserUtils.hover(customerInfo.accountElement);
        BrowserUtils.sleep(2);*/
    }



    @Then("user clicks filter button")
    public void user_clicks_filter_button() {
        customerInfo.filterElement.click();

    }
    @Then("user sees eight filter items")
    public void user_sees_eight_filter_items(List<String> expectedListOfAccount) {
        Select accounts = new Select(customerInfo.listOfAccount);

        List <WebElement> actualListofAccount_WebElement = accounts.getOptions();

        List <String> actualListofAccount_String = new ArrayList<>();

        for (WebElement eachWebElement : actualListofAccount_WebElement) {

            actualListofAccount_String.add(eachWebElement.getAttribute("title"));

        }
        Assert.assertEquals(expectedListOfAccount,actualListofAccount_String);





    }


















}

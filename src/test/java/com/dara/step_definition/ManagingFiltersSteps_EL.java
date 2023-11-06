package com.dara.step_definition;

import com.dara.pages.Home_page_dara;
import com.dara.pages.Login_page_dara;
import com.dara.pages.MarketingPage_EL;
import com.dara.utilities.BrowserUtils;
import com.dara.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

//import java.util.ArrayList;
import java.util.List;

public class ManagingFiltersSteps_EL {

    Login_page_dara loginPageDara = new Login_page_dara();
    MarketingPage_EL marketingPageEl = new MarketingPage_EL();
    Home_page_dara homePageDara = new Home_page_dara();
    int amountUnchecked;


    @Given("user logs in as sales user")
    public void user_logs_in_as_sales_user() {
        loginPageDara.dynamicLogin("sales manager");
    }

    @Given("user is on marketing page")
    public void user_is_on_marketing_page() {
        Actions actions = new Actions(Driver.getDriver());
        BrowserUtils.waitForInvisibilityOf(Driver.getDriver().findElement(By.xpath("/html/body/div[4]/div")));
        actions.moveToElement(homePageDara.marketingTab).perform();
        homePageDara.marketingPage.click();
    }

    @When("user clicks on 'Manage filters' button")
    public void user_clicks_on_button() {
        marketingPageEl.filtersButton.click();
        marketingPageEl.manageFiltersButton.click();
    }

    @Then("user should see all 5 filter options provided below checked")
    public void user_should_see_all_filter_options_provided_below(List<String> filterOptions) {
        for (WebElement actualFilterOption : marketingPageEl.actualFilterOptions) {
            Assert.assertTrue("The option is not in the filters", filterOptions.contains(actualFilterOption.getAttribute("title")));
            Assert.assertTrue("The option is not checked by default", marketingPageEl.checkIfChecked(actualFilterOption));
        }

    }

    @When("user unchecks {int} boxes")
    public void user_clicks_unchecks_boxes(int integer) {
        double randomNumber;
        for (int i = 0; i < integer; i++) {
            randomNumber = Math.random();
            if (randomNumber < 0.2 && marketingPageEl.budgetCheckBox.isSelected())
                marketingPageEl.budgetCheckBox.click();
            else if (randomNumber < 0.4 && marketingPageEl.startDateCheckBox.isSelected())
                marketingPageEl.startDateCheckBox.click();
            else if (randomNumber < 0.6 && marketingPageEl.endDateCheckBox.isSelected())
                marketingPageEl.endDateCheckBox.click();
            else if (randomNumber < 0.8 && marketingPageEl.codeCheckBox.isSelected())
                marketingPageEl.codeCheckBox.click();
            else if (randomNumber <= 1.0 && marketingPageEl.nameCheckBox.isSelected())
                marketingPageEl.nameCheckBox.click();
        }
        amountUnchecked = integer;
    }

    @Then("user should still see remaining filters")
    public void user_should_still_see_remaining_filters() {
        int counter = 0;
        try{
            for (WebElement actualFilterOption : marketingPageEl.actualFilterOptions) {
                if (!actualFilterOption.isSelected()) counter++;
            }
            Assert.assertEquals(amountUnchecked, counter);
        }catch (StaleElementReferenceException e){
            for (WebElement actualFilterOption : marketingPageEl.actualFilterOptions) {
                if (!actualFilterOption.isSelected()) counter++;
            }
            Assert.assertEquals(amountUnchecked, counter);
        }

    }

    @Given("user logs in as store manager user")
    public void user_logs_in_as_store_manager_user() {

        loginPageDara.dynamicLogin("store manager");
    }


}

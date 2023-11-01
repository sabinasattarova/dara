package com.dara.step_definition;

import com.dara.pages.OronicDocWindow_page_WH;
import com.dara.utilities.BrowserUtils;
import com.dara.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class OronicDocWindow_stepDef_WH {
    OronicDocWindow_page_WH oronicWindow = new OronicDocWindow_page_WH();


    @Then("user clicks on the Question mark")
    public void user_clicks_on_the_question_mark() {
        oronicWindow.questionMark.click();

    }
    @Then("user is on the OroDocs Window Page")
    public void user_is_on_the_oro_docs_window_page() {
       BrowserUtils.switchToWindow("https://doc.oroinc.com/");

    }


    @Then("user verifies link {string}")
    public void userVerifiesLink(String expectedURL) {

       for(String each : Driver.getDriver().getWindowHandles()){
           Driver.getDriver().switchTo().window(each);
           }

        String actualURL = Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(actualURL,expectedURL);
    }
}

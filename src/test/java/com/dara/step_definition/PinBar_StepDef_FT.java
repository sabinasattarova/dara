package com.dara.step_definition;

import com.dara.pages.PinBar_page_FT;
import com.dara.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class PinBar_StepDef_FT {
    PinBar_page_FT pinBarPageFt = new PinBar_page_FT();
    @When("the user clicks the Learn how to use this space link")
    public void the_user_clicks_the_learn_how_to_use_this_space_link() {
    pinBarPageFt.LearnHowToUseThisSpaceLink.click();
    }
    @Then("the page should display the text {string}")
    public void thePageShouldDisplayTheText(String expectedheading) {
        String actualHeading = pinBarPageFt.heading.getText();

        Assert.assertEquals(actualHeading,expectedheading);
    }

    @Then("the page should contain the instruction {string}")
    public void the_page_should_contain_the_instruction(String expectedinstructions) {
        BrowserUtils.sleep(4);
        String actualInstructions = pinBarPageFt.instructions.getText();
        System.out.println(actualInstructions);
        Assert.assertTrue(actualInstructions.contains(expectedinstructions));

    }

    @Then("the page should contain an image source {string}")
    public void the_page_should_contain_an_image_source(String expectedimagesource) {
       String actualInstructions = pinBarPageFt.pinbar.getAttribute("src");
       BrowserUtils.sleep(4);
        Assert.assertEquals(expectedimagesource,actualInstructions);



    }



}

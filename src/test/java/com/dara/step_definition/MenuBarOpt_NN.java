package com.dara.step_definition;

import com.dara.pages.Home_driver_page_dara;
import com.dara.pages.Home_page_dara;
import com.dara.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class MenuBarOpt_NN {


        Home_page_dara homePage = new Home_page_dara();
        Home_driver_page_dara driverPage = new Home_driver_page_dara();

    @Then("the {string} should see following menu bar options")
    public void the_should_see_following_menu_bar_options(String userType, List<String> expectedMenuBarOpt) {

        if (userType.equals("driver")){
            List<String> actualMenuBArOpts = BrowserUtils.getElementsText(driverPage.menuBarOpts);
            System.out.println(actualMenuBArOpts);
            System.out.println("driverPage.calendarEventsTab.getText() = " + driverPage.calendarEventsTab.getText());
            Assert.assertEquals(expectedMenuBarOpt, actualMenuBArOpts);
        }else {
            List<String> actualMenuBArOpts = BrowserUtils.getElementsText(homePage.menuBarOpts);
            Assert.assertEquals(expectedMenuBarOpt, actualMenuBArOpts);
        }

    }
}

package com.dara.step_definition;

import com.dara.pages.Home_page_dara;
import com.dara.pages.VehicleModels_page_AZ;
import com.dara.utilities.BrowserUtils;
import com.dara.utilities.Driver;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Edit_car_info_icons_stepDef_SS {
    Home_page_dara homePage = new Home_page_dara();
    Actions action = new Actions(Driver.getDriver());

    VehicleModels_page_AZ vehiclesModel = new VehicleModels_page_AZ();

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));

    @Then("user chooses {string} from Fleet drop-down")
    public void user_chooses_from_fleet_drop_down(String dropdownOption) {

        wait.until(ExpectedConditions.elementToBeClickable(homePage.fleetTab));

       // homePage.chooseDropdownOption(homePage.marketingTab, homePage.marketingTabDropdown, "Campaigns");

      homePage.chooseDropdownOption(homePage.fleetTab, homePage.fleetTabDropDown, dropdownOption);

        //action.moveToElement(homePage.vehicleModelOption).pause(2000).click().perform();
    }
    @Then("user hovers over on three dots on car table line following options should appear")
    public void user_hovers_over_on_three_dots_on_car_table_line_following_options_should_appear(List<String> editOptions) {

        //Driver.actions().moveToElement(vehiclesModel.editDropdownDots).perform();

   WebElement viewBtn =
        Driver.getDriver().findElement(By.xpath(
        "//*[@id='grid-custom-entity-grid-364844007']/div[2]/div[2]/div[2]/div/table/tbody/tr[1]/td[12]/div/div/ul/li/ul/li[1]/a"));
     //tbody[@class='grid-body']/tr[1]//div[@class='more-bar-holder']//li[@class='launcher-item']/a

        WebElement element = Driver.getDriver().findElement(By.id("//*[@id='grid-custom-entity-grid-364844007']/div[2]/div[2]/div[2]/div/table/tbody/tr[1]/td[12]/div/div/ul/li/ul/li[1]/a"));
        String displayProperty = element.getCssValue("display");
        boolean isHidden = "none".equals(displayProperty);

        System.out.println("eachOpt.getAttribute(\"title\") = " + viewBtn.getAttribute("title"));

       /* for (WebElement eachOpt : viewBtn) {
            System.out.println("eachOpt.getAttribute(\"title\") = " + eachOpt.getAttribute("title"));
        }

        */


       // action.moveToElement(viewBtn).pause(2000).click().perform();


        for (WebElement eachOpt : vehiclesModel.viewEditDeleteOpt) {



        }



    }
    @Then("user sees error msg {string}")
    public void user_sees_error_msg(String string) {

    }




}

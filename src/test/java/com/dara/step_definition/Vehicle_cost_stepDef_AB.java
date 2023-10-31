package com.dara.step_definition;

import com.dara.pages.Login_page_dara;
import com.dara.pages.Vehicle_cost_page_AB;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Vehicle_cost_stepDef_AB {

    Vehicle_cost_page_AB vehicleCostPage = new Vehicle_cost_page_AB();
    Login_page_dara loginPage = new Login_page_dara();

    @Given("the user logged in as {string}")
    public void theUserLoggedInAs(String arg0) {
        loginPage.dynamicLogin(arg0);
    }

    @Then("the user selects Vehicle Cost from Fleet module")
    public void theUserSelectsVehicleCostFromFleetModule() {

    }

    @And("the user should see the following column names")
    public void theUserShouldSeeTheFollowingColumnNames() {
    }

    @And("users check the first checkbox to check all the Vehicle Costs")
    public void usersCheckTheFirstCheckboxToCheckAllTheVehicleCosts() {
    }

    @Then("user should see all the Vehicle Costs are checked")
    public void userShouldSeeAllTheVehicleCostsAreChecked() {
    }
}

package com.dara.step_definition;

import com.dara.utilities.Driver;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.PageFactory;

public class VehicleModels_stepDef_AZ {

    public VehicleModels_stepDef_AZ() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @Then("verify user sees the following columns")
    public void verify_user_sees_the_following_columns(io.cucumber.datatable.DataTable dataTable) {

    }

    @Then("verify “You do not have permission to perform this action.” error message is displayed")
    public void verify_you_do_not_have_permission_to_perform_this_action_error_message_is_displayed() {

    }


}

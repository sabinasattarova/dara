package com.dara.pages;

import com.dara.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class Vehicle_cost_page_AB {

    public Vehicle_cost_page_AB(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}

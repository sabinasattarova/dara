package com.dara.pages;

import com.dara.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class Home_driver_page_dara {

    //for driver user home page POM

    public Home_driver_page_dara(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


}
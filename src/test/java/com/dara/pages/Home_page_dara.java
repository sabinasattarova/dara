package com.dara.pages;

import com.dara.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class Home_page_dara {

    // for store manager and sales manager users POM

    public Home_page_dara(){
        PageFactory.initElements(Driver.getDriver(), this);
    }




}

package com.cucumber.onliner.pageobject;

import com.cucumber.onliner.driver.DriverManager;

public abstract class BasePage {

    public BasePage() {
        DriverManager.initDriver();
    }
}

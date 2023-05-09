package com.cucumber.onliner;

import com.cucumber.onliner.driver.DriverManager;
import org.testng.annotations.BeforeClass;


public class BaseTest {

    @BeforeClass
    public void init() {
        DriverManager.initDriver();
    }
}

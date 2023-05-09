package com.cucumber.onliner.hooks;

import io.cucumber.java.BeforeAll;

public class DriverHooks {

    @BeforeAll
    public static void setupDriver() {
        System.out.println("Before");
    }
}

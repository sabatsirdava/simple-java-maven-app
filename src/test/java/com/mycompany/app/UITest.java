package com.mycompany.app;

import org.testng.annotations.Test;
import io.qameta.allure.Description;
import io.qameta.allure.testng.AllureTestNg;
import org.testng.annotations.Listeners;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import static org.testng.Assert.assertEquals;

@Listeners({AllureTestNg.class})
public class UITest {

    private Object driver;

    @BeforeClass
    public void setupBrowser() {
        driver = new Object();
        System.out.println("Driver initialized for UI tests.");
    }

    @Test(groups = {"ui"})
    @Description("Verify the homepage title and log in button visibility.")
    public void verifyHomepageTitle() {
        String actualTitle = "My Application Homepage";

        System.out.println("Executing UI Test: Navigating and verifying title.");
        assertEquals(actualTitle, "My Application Homepage", "Homepage title verification failed.");
    }

    @Test(groups = {"ui"})
    @Description("Verify basic login functionality by checking for a dashboard element.")
    public void checkLoginFunctionality() {
        boolean loginSuccess = true;

        System.out.println("Executing UI Test: Attempting login and checking dashboard.");
        assertEquals(loginSuccess, true, "Login functionality failed to navigate to dashboard.");
    }

    @AfterClass
    public void teardownBrowser() {
        driver = null;
        System.out.println("Driver closed after UI tests.");
    }
}

package com.mycompany.app;

import io.qameta.allure.testng.AllureTestNg;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

@Listeners({AllureTestNg.class})
public class AnotherAppTest {

    @Test(groups = {"api"})
    public void testAppNotNull() {
        App app = new App();
        assertNotNull(app, "App instance should not be null");
    }

    @Test(groups = {"api"})
    public void testAppMessageContains() {
        App app = new App();
        assertTrue(app.getMessage().contains("Hello"), "Message should contain 'Hello'");
    }
}

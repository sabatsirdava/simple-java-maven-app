package com.mycompany.app;


import org.testng.annotations.Test;

import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

public class AdditionalTest {

    @Test
    public void testAppNotNull() {
        App app = new App();
        assertNotNull(app, "App instance should not be null");
    }

    @Test
    public void testAppHostname() {
        App app = new App();
        assertTrue(app.getHostname().contains("Saba"), "Incorrect Hostname");
    }
}

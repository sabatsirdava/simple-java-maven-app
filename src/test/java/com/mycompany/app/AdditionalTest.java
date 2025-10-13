package com.mycompany.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

package com.mycompany.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class AnotherAppTest {

    @Test
    public void testAppNotNull() {
        App app = new App();
        assertNotNull(app, "App instance should not be null");
    }

    @Test
    public void testAppMessageContains() {
        App app = new App();
        assertTrue(app.getMessage().contains("Hello"), "Message should contain 'Hello'");
    }
}
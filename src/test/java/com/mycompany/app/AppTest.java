package com.mycompany.app;

import org.testng.annotations.Test;
import io.qameta.allure.testng.AllureTestNg;
import org.testng.annotations.Listeners;

import static org.testng.Assert.assertEquals;

@Listeners({AllureTestNg.class})
public class AppTest
{
    @Test(groups = {"unit", "api"})
    public void testAppConstructor() {
        App app1 = new App();
        App app2 = new App();
        assertEquals(app1.getMessage(), app2.getMessage());
    }

    @Test(groups = {"unit", "api"})
    public void testAppMessage()
    {
        App app = new App();
        assertEquals(app.getMessage(), "Hello World!");
    }
}

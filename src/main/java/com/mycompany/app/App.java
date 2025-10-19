package com.mycompany.app;

import io.qameta.allure.Step;

/**
 * Hello world!
 */
public class App {

    private static final String MESSAGE = "Hello World!";
    private static final String HOSTNAME = "Saba Tsirdava";

    public App() {}

    public static void main(String[] args) {
        System.out.println(MESSAGE);
    }

    public String getMessage() {
        return MESSAGE;
    }
    @Step("get hostname")
    public String getHostname() {
        return HOSTNAME;
    }
}

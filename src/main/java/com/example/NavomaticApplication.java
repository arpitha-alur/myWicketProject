package com.example;

import org.apache.wicket.protocol.http.WebApplication;

public class NavomaticApplication extends WebApplication {
    public NavomaticApplication() {
    }

    public Class getHomePage() {
        return Page1.class;
    }
}
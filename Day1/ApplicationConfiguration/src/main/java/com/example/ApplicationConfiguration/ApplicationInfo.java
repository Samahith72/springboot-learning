package com.example.ApplicationConfiguration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component 
public class ApplicationInfo {

    @Value("${application.name}")
    private String name;

    @Value ("${application.version}")
    private double version;

    @Value ("${application.maximum-user}")
    private int maxUser;

    public void displayInfo(){
        System.out.println("Application Name: "+ name);
        System.out.println("Application Version: "+version);
        System.out.println("Maximum Users: " + maxUser);
    }

}

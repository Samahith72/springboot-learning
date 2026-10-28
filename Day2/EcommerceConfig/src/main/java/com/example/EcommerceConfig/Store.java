package com.example.EcommerceConfig;

import org.springframework.stereotype.Component;

@Component 
public class Store {

    private final StoreConfiguration storeConfiguration;

    public Store(StoreConfiguration storeConfiguration){
        this.storeConfiguration = storeConfiguration;
    }

    public void displayStore(){
        System.out.println("=========Store Details========");
        System.out.println("Store Name: "+ storeConfiguration.getName());
        System.out.println("Location: "+storeConfiguration.getLocation());
        System.out.println("Maximum Products: "+ storeConfiguration.getMaxProduct());
        System.out.println("Store maintenance: "+ storeConfiguration.isMaintenanceMode());
    }
}

package com.example.EcommerceConfig;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component 
@ConfigurationProperties (prefix = "store")
public class StoreConfiguration {

    private String name;
    private String location;
    private int maxProduct;
    private boolean maintenanceMode;

    
    public String getName() {
        return name;
    }
    public String getLocation() {
        return location;
    }
    public int getMaxProduct() {
        return maxProduct;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public void setMaxProduct(int maxProduct) {
        this.maxProduct = maxProduct;
    }
    public boolean isMaintenanceMode() {
        return maintenanceMode;
    }
    public void setMaintenanceMode(boolean maintenanceMode) {
        this.maintenanceMode = maintenanceMode;
    }

    

}

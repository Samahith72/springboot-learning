package com.example.ProductConfig;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component 
@ConfigurationProperties (prefix = "product")
public class ProductConfig {

    private String name;
    private String brand;
    private float price;
    private int stock;
    public String getName() {
        return name;
    }
    public String getBrand() {
        return brand;
    }
    public float getPrice() {
        return price;
    }
    public int getStock() {
        return stock;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }

    
}

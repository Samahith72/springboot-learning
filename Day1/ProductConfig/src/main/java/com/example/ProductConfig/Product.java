package com.example.ProductConfig;

import org.springframework.stereotype.Component;

@Component 
public class Product {

    private final ProductConfig productConfig;

    public Product(ProductConfig productConfig){
        this.productConfig = productConfig;
    }

    public void display(){
        System.out.println("Product Name: "+ productConfig.getName());
        System.out.println("Brand: "+ productConfig.getBrand());
        System.out.println("Price: " + productConfig.getPrice());
        System.out.println("Available Stock: "+ productConfig.getStock());
    }

}

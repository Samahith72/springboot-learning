package com.example.ProductConfig;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProductConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductConfigApplication.class, args);
	}

	@Bean 
	public ApplicationRunner applicationRunner(Product product){
		return args -> product.display();
	}
}

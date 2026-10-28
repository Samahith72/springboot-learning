package com.example.EcommerceConfig;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EcommerceConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceConfigApplication.class, args);
	}

	@Bean 
	public ApplicationRunner applicationRunner(Store store, Payment payment){
		return  args ->{ 
			store.displayStore();
			payment.displayPayment();

		};

	}

}

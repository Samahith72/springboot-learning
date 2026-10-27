package com.example.EmployeeConfig;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EmployeeConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeConfigApplication.class, args);
	}

	@Bean 
	public ApplicationRunner applicationRunner(Employee employee){
		return args-> employee.display();
	}
}

package com.example.ApplicationConfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ApplicationConfigurationApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ApplicationConfigurationApplication.class, args);

		ApplicationInfo applicationInfo = context.getBean(ApplicationInfo.class);

		applicationInfo.displayInfo();
	}

}

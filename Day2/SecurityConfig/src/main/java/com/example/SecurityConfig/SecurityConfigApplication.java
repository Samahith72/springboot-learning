package com.example.SecurityConfig;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class SecurityConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityConfigApplication.class, args);
	}

	@Bean 
	public ApplicationRunner applicationRunner(SecurityManager securityManager){
		return args->{
			securityManager.displaySecurityReport();
			securityManager.validateConfiguration();
		};
	}

}

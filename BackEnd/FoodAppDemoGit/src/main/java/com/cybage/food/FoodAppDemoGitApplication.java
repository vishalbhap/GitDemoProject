package com.cybage.food;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.cybage.model")
public class FoodAppDemoGitApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodAppDemoGitApplication.class, args);
	}

}

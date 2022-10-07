package com.cybage.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.cybage.model.User;


@SpringBootApplication(scanBasePackages = "com.cybage")
@EnableJpaRepositories(basePackages = "com.cybage.dao")
@EntityScan(basePackages = "com.cybage.model")
public class BankApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankApplication.class, args);
		System.out.println("Vishal1");
		User user = new User();
		
	}

}

package com.cybage.food;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.cybage.model.User;

@SpringBootApplication(scanBasePackages = "com.cybage")
@EnableJpaRepositories(basePackages = "com.cybage.dao")
@EntityScan(basePackages = "com.cybage.model")
public class FoodAppDemoGitApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodAppDemoGitApplication.class, args);
		System.out.println("Vishal1");
		User user = new User();
		user.setUserId(1);
		user.setUserName("vishalbhap");
		System.out.println("UserName : "+user.getUserName());
		System.out.println(user);
	}

}

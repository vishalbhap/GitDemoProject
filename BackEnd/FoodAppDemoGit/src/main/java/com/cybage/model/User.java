package com.cybage.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "user")
public class User {
	@Id
	@GeneratedValue
	private int userId;
	private String userName;
	private String userPassword;
	private String userEmail;
	private String userMobileNo;
	private int attemptsCount;
	
	public User() {
		System.out.println("In constructor");
	}

	public User(int userId, String userName, String userPassword, String userEmail, String userMobileNo,
			int attemptsCount) {
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userEmail = userEmail;
		this.userMobileNo = userMobileNo;
		this.attemptsCount = attemptsCount;		
	}
}

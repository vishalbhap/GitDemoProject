package com.cybage.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name = "user")
@NoArgsConstructor
@Getter
@Setter
@ToString
@AllArgsConstructor
public class User {
	@Id
	@GeneratedValue
	private int userId;
	private String userName;
	private String userPassword;
	private String userEmail;
	private String userMobileNo;
	private int attemptsCount;
	
}

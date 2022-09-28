package com.cybage.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cybage.model.User;

public interface UserService {
	List<User> getAllUsers();
	
	void addUser(User user);
}

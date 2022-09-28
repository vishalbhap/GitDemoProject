package com.cybage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cybage.model.User;
import com.cybage.service.UserService;

@RestController
@RequestMapping("/foodApp/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/getAllUsers")
	public ResponseEntity<?> getAllUsers(){
		return new ResponseEntity<>(userService.getAllUsers(), HttpStatus.OK);
	}
	
	@PostMapping("/addUser")
	public ResponseEntity<String> addUser(@RequestBody User user){
		userService.addUser(user);
		return new ResponseEntity<>("User added successfully", HttpStatus.OK);
	}
}

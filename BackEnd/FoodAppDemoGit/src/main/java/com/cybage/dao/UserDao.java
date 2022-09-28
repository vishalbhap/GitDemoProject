package com.cybage.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cybage.model.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer>{
	
}

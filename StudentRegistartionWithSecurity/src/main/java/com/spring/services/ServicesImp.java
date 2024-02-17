package com.spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.spring.models.Student;
import com.spring.models.User;
import com.spring.repo.UserRepository;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

@Service
public class ServicesImp implements com.spring.ServiceInterface.Service {

	@Autowired
	private UserRepository ur;
	List<User> list = new ArrayList<>();
	// Constructor with initial users injected

	// Get all users
	public List<User> getAllUsers() {
		return this.list;
	}

	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		this.ur.save(user);

	}

	// Get single user
	public User getUser(String username) {
		return this.list.stream().filter(user -> user.getUsername().equals(username)).findAny().orElse(null);
	}

	// Add user
	public User addUser(User user) {
		this.list.add(user);
		return user;
	}
	
	
	
}

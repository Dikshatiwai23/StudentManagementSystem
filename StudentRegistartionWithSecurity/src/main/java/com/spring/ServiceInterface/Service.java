package com.spring.ServiceInterface;

import java.util.ArrayList;
import java.util.List;

import com.spring.models.User;

public interface Service {

	 

	 List<User> getAllUsers();
	 User getUser(String username);
	 User addUser(User user);

		void saveUser(User user);
	 
//	 Use
	 }

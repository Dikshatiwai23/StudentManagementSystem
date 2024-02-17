package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.models.Student;
import com.spring.models.User;
import com.spring.services.ServicesImp;

@Controller
public class UserController {
	@Autowired
	private ServicesImp si;
	@Autowired
	private BCryptPasswordEncoder b;
	
	
	@GetMapping("/newuser")
	public String newuser() {
		return "new-user";
	}
	
	@PostMapping("/saveUser")
	public String saveStudent(@ModelAttribute("user") User user) {
		//save student from the db;
		user.setPassword(this.b.encode(user.getPassword()));
		si.saveUser(user);
		
		return "log.html";
	}
	
	
		
}

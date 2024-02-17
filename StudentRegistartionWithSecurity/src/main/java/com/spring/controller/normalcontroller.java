package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.models.CustomUserDetails;
import com.spring.services.StudentServiceimp;

@Controller

@RequestMapping("/normal")
public class normalcontroller {
	
	@Autowired
	private StudentServiceimp stuService;
	
	/*
	 * @GetMapping("/") public String ViewPage(@AuthenticationPrincipal
	 * CustomUserDetails cs, Model m) {
	 * 
	 * String st=cs.getUsername(); m.addAttribute("user",st); String
	 * role=cs.getRole(); m.addAttribute("role",role);
	 * 
	 * m.addAttribute("listStudents", stuService.getAllStudent());
	 * 
	 * return "user"; }
	 */
	@GetMapping("/")
	public String regi() {
		return "user";
	}
	
}

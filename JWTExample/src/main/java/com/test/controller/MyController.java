package com.test.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.models.User;
import com.test.service.UserService;

@RestController
@RequestMapping("/users")
public class MyController {
	@Autowired
	private UserService service;
	 @GetMapping("/")
	public List<User> getuser() {
		return this.service.getuser();
	}
	 @GetMapping("/current-user")
	 public String getLoginUser(Principal principal) {
		return principal.getName();
		 
	 }
	


}

package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.LoginCred;
import com.example.demo.entity.User;
import com.example.demo.enums.Gender;
import com.example.demo.services.UserServices;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserServices service;
	
	
	@PostMapping("/login")
	public User login( @RequestBody LoginCred loginCred)
	{
		
		return service.login(loginCred);
				}
	
	@PostMapping("/register")
	public User register( @RequestBody User user)
	{
		
		return service.register(user);
				}
	
	
}

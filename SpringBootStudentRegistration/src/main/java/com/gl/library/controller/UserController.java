package com.gl.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gl.library.entity.User;
import com.gl.library.service.UserDetailsService;

@RestController("/user")
public class UserController {

	@Autowired
	UserDetailsService userDetailsService;
	
	@PostMapping("/save")
	public void saveUserDetails(@RequestBody User user) {
		userDetailsService.save(user);
	
}
}

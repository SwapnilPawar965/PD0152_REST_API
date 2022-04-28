package com.example.demo.Controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entities.Data;
import com.example.demo.Entities.User;
import com.example.demo.Services.UserService;

@RestController
public class UserController {
	
	UserService uservice = new  UserService();
	
	@PostMapping("/bfhl")
	public User getUser(@RequestBody Data data) {
		return uservice.getUser(data.getData());
	}
	
}
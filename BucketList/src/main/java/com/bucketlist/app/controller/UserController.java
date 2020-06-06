package com.bucketlist.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bucketlist.app.model.User;
import com.bucketlist.app.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/user/{id}")
	public User getUserById(@PathVariable("id") int id) {
		return userService.getUserById(id);
	}
	
	@GetMapping("/user/all")
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}
	
	@GetMapping("user/email/{email}")
	public User getUserByEmail(@PathVariable("email") String email) {
		return userService.getUserByEmail(email);
		
	}
	
	@PostMapping("/user")
	public User createUser(@RequestBody User user) {
		return userService.createUser(user);
	}
	
	@PutMapping("/user")
	public User updateUser(@RequestBody User user) {
		return userService.updateUser(user);
	}
	
	@DeleteMapping("/user/delete/{id}")
	public void deleteUserById(@PathVariable("id") int id) {
		userService.deleteUserById(id);
	}
	
	
}

package com.bucketlist.app.service;

import java.util.List;

import com.bucketlist.app.model.User;

public interface UserService {
	public User createUser(User user);
	public User updateUser(User user);
	public User getUserById(int id);
	public void deleteUserById(int id);
	public List<User> getAllUsers();
	public User getUserByEmail(String email);
}

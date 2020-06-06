package com.bucketlist.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bucketlist.app.dao.UserDao;
import com.bucketlist.app.model.User;
import com.bucketlist.app.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserDao userDao;

	@Override
	public User createUser(User user) {
		return userDao.save(user);
	}

	@Override
	public User updateUser(User user) {
		return userDao.save(user);
	}

	@Override
	public User getUserById(int id) {
		return userDao.findById(id).get();
	}

	@Override
	public void deleteUserById(int id) {
		userDao.deleteById(id);
		
	}

	@Override
	public List<User> getAllUsers() {
		return userDao.findAll();
	}

	@Override
	public User getUserByEmail(String email) {
		List<User> userList = userDao.findAll();
		for(User user : userList) {
			if(user.getEmail().equals(email)) {
				return user;
			}
		}
		return null;
	}

}

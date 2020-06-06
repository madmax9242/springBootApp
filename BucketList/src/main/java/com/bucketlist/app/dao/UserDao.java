package com.bucketlist.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bucketlist.app.model.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {
	public User findUserByEmail(String email);

}

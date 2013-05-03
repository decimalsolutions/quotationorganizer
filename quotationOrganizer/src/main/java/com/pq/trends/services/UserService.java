package com.pq.trends.services;

import java.util.List;

import com.pq.trends.domain.User;


public interface UserService {
	
	
	User findUser(String userId, String password);
	
	List<User> getAllUsers();

}

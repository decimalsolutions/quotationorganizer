package com.pq.trends.services;

import java.util.List;

import com.pq.trends.domain.User;


public interface UserService {
	
	
	User findUser(String userId, String password);
	
	List<User> getAllUsers();
	
	User save(User user);

	void delete(String id);

	void addUsers(List<User> userstoadd);

}

package com.pq.trends.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.pq.trends.dao.UserDao;
import com.pq.trends.domain.User;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserDao ud;
	@Override
	public User findUser(String userId, String password) {
		User usr  = ud.findOne(userId);
		if(usr!=null && usr.getPassword().equals("password")){
			return usr;
		}else
			return null;
	}
	
	@Override
	public List<User> getAllUsers() {
				
		return ud.findAll();
	}

	@Override
	public User save(User user) {
		
		return ud.save(user);
	}
	
	@Override
	public void delete(String id) {
		
		ud.delete(id);
	}
	 	

}

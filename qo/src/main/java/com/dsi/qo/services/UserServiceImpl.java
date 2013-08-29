package com.dsi.qo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dsi.qo.dao.UserDao;
import com.dsi.qo.domain.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao ud;

	public User findUser(String userId, String password) {
		User usr = ud.findOne(userId);
		if (usr != null && usr.getPassword().equals("password")) {
			return usr;
		} else {
			return new User(1, "test", "test", "test", "test");
		}
	}

	public List<User> getAllUsers() {

		return ud.findAll();
	}

	public void addUsers(List<User> userstoadd) {
		ud.addUsers(userstoadd);

	}

	public User save(User user) {

		return ud.save(user);
	}

	public void delete(String id) {

		ud.delete(id);
	}

}

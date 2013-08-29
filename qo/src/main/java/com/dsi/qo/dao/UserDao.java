package com.dsi.qo.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dsi.qo.domain.User;

public interface UserDao extends MongoRepository<User, String> {

	void addUsers(List<User> userstoadd);

}

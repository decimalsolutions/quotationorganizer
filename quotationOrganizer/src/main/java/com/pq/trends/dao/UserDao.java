package com.pq.trends.dao;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.pq.trends.domain.User;


public interface UserDao extends MongoRepository<User,String> {
	
	

}

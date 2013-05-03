package com.pq.trends.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.pq.trends.domain.User;

@Repository 
public class UserDaoImpl implements UserDao {

	@Autowired
	MongoTemplate mongoTemplate;
	@Override
	public List<User> findAll() {
		List<User> allUsers = mongoTemplate.findAll(User.class);
		return allUsers;
	}

	@Override
	public List<User> findAll(Sort arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends User> List<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<User> findAll(Pageable arg0) {
		
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(String arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(User arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Iterable<? extends User> arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean exists(String arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<User> findAll(Iterable<String> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findOne(String arg0) {
		
		Query query2 = new Query();
		query2.addCriteria(Criteria.where("firstName").is("rajeev1"));
		
		User lu = mongoTemplate.findOne(query2,User.class);
		System.out.println(lu);
		return lu;
	}

	@Override
	public <S extends User> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}

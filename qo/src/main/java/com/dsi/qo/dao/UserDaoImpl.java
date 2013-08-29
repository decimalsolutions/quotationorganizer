package com.dsi.qo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.dsi.qo.domain.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	MongoTemplate mongoTemplate;

	public List<User> findAll() {
		List<User> allUsers = mongoTemplate.findAll(User.class);
		return allUsers;
	}

	public List<User> findAll(Sort arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends User> List<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public Page<User> findAll(Pageable arg0) {

		return null;
	}

	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void delete(String arg0) {
		Query query2 = new Query();
		query2.addCriteria(Criteria.where("id").is(new Integer(arg0)));
		mongoTemplate.remove(query2, User.class);

	}

	public void delete(User arg0) {
		// TODO Auto-generated method stub

	}

	public void delete(Iterable<? extends User> arg0) {
		// TODO Auto-generated method stub

	}

	public void deleteAll() {
		// TODO Auto-generated method stub

	}

	public boolean exists(String arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public Iterable<User> findAll(Iterable<String> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public User findOne(String id) {

		Query query2 = new Query();
		query2.addCriteria(Criteria.where("id").is(new Integer(id)));

		User lu = mongoTemplate.findOne(query2, User.class);
		System.out.println(lu);
		return lu;
	}

	public <S extends User> S save(S arg0) {
		mongoTemplate.save(arg0);
		return arg0;
	}

	public void remove(User user) {
		mongoTemplate.remove(user);

	}

	public void addUsers(List<User> userstoadd) {
		mongoTemplate.insert(userstoadd, "users");

	}

}

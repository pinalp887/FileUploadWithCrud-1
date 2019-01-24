package com.cignex.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cignex.entity.User;
import com.cignex.repository.UserRepository;

@Service
public class UserServices {
	@Autowired
	private UserRepository repository;
	
	public void insert(User user) {
		repository.save(user);
	}
	
	public List<User> getAllUser(){
		List<User> list=repository.findAll();
		return list;
	}
	public User findUser(int id) {
		User user=repository.findById(id);
		return user;
	}
	
	public void delete(int id) {
		User user=repository.findById(id);
		repository.delete(user);
	}
}

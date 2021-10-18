package com.bank.BankSysytem.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.bank.BankSystem.models.User;
import com.bank.BankSysytem.repositories.UserRepository;

public class UserService {

	@Autowired
	private UserRepository repo;
	
	//create
	public User createUser(User user) {
		return repo.save(user);
	}
	
	// read
	public User readUser(Integer id) {
		return repo.findById(id).get();
	}
	
	// list
	public List<User> listUsers(){
		return (List<User>) repo.findAll();
	}
	
	// delete
	public void deleteUser(Integer id) {
		repo.deleteById(id);
	}
	
}

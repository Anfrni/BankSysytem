package com.bank.BankSysytem.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.bank.BankSystem.models.User;
import com.bank.BankSysytem.services.UserService;

/**
 * @author anfernee
 * This class should be the main java class that will be interacting with the User database table
 */
public class UserController {
	
	@Autowired
	private UserService userServ;
	
	/**
	 * @return list content of User table from DataBase
	 */
	public List<User> getAllUsers() {
		// fetch data from DB(USERS), construct and return JSON list from data
		return userServ.listUsers();
	}

	/**
	 * @param id
	 * @return information of a single user from User table
	 */
	public User getUser(Integer id) {
		// get user from DB given specified ID
		return userServ.readUser(id);
	}
	
	/**
	 * @param id
	 * @param username
	 * @param password
	 * @param role
	 * creates User in database table with the specified parameters.
	 * This method is not called often
	 */
	public void createUser(User user) {
		// create user in DB tableS: 'USERS'
		userServ.createUser(user);
	}
	
	/**
	 * @param id
	 * delete user in database table with specified ID
	 */
	public void deleteUser(Integer id) {
		// remove user with given id from all DBs
		userServ.deleteUser(id);
	}
}

package com.bank.BankSysytem.controllers;

import com.bank.BankSystem.models.User;
import com.bank.BankSysytem.services.UserService;

/**
 * @author anfernee
 * This class should be the main java class that will be interacting with the User database table
 */
public class UserController {
	
	private UserService userServ;
	
	/**
	 * @return list content of User table from DataBase
	 */
	public String getAllUsers() {
		// TODO fetch data from DB(USERS), construct and return JSON list from data
		System.out.println("implement logic to list all users");
		return "Hello user data";
	}

	/**
	 * @param id
	 * @return information of a single user from User table
	 */
	public String getUser(Integer id) {
		// TODO get user from DB given specified ID
		System.out.println("need to implement get User logic");
		return String.format("Hello user %s", id);
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
		// TODO create user in DB tableS: 'USERS'
		userServ.createUser(user);
	}
	
	/**
	 * @param id
	 * delete user in database table with specified ID
	 */
	public void deleteUser(Integer id) {
		// TODO remove user with given id from all DBs
		userServ.deleteUser(id);
	}
}

package com.bank.BankSysytem.controllers;


/**
 * @author anfernee
 * This class should be the main java class that will be interacting with the User database table
 */
public class UserController {
	
	/**
	 * @return list content of User table from DataBase
	 */
	public static String getAllUsers() {
		// TODO fetch data from DB(USERS), construct and return JSON list from data
		System.out.println("implement logic to list all users");
		return "Hello user data";
	}

	/**
	 * @param id
	 * @return information of a single user from User table
	 */
	public static String getUser(int id) {
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
	public static void createUser(int id, String firstname, String surname, String phone, String address) {
		// TODO create user in DB tableS: 'USERS', 'CREDENTIALS'
		System.out.print("need to implement create user logic");
		System.out.println(String.format(" for %s %s", firstname, surname));
	}
	
	/**
	 * @param id
	 * delete user in database table with specified ID
	 */
	public static void deleteUser(int id) {
		// TODO remove user with given id from all DBs
		System.out.println("implement delete user logic");
	}
}

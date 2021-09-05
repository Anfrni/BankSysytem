package com.bank.BankSysytem.controllers;


public class UserController {
	
	public static String getAllUsers() {
		// TODO fetch data from DB(USERS), construct and return JSON list from data
		return "Hello user data";
	}

	public static String getUser(int id) {
		// TODO get user from DB given specified ID
		return String.format("Hello user %s data", id);
	}
	
	public static void createUser(int id, String username, String password, int role) {
		// TODO create user in DB tableS: 'USERS', 'CREDENTIALS'
	}
	
	public static void deleteUser(int id) {
		// TODO remove user with given id from all DBs
	}
}

package com.bank.BankSysytem.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("/v1/users")
	public String getAllUsers() {
		// TODO fetch data from DB(USERS), construct and return JSON list from data
		return "Hello user data";
	}

	@GetMapping("/v1/users/{id}")
	public String getUser(@PathVariable int id) {
		// TODO get user from DB given specified ID
		return String.format("Hello user %s data", id);
	}
	
	@PostMapping("/v1/users/")
	public void createUser(int id, String username, String password, int role) {
		// TODO create user in DB tableS: 'USERS', 'CREDENTIALS'
	}
	
	@DeleteMapping("/v1/users/{id}")
	public void deleteUser(@PathVariable int id) {
		// TODO remove user with given id from all DBs
	}
}

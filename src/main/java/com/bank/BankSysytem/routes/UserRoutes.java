package com.bank.BankSysytem.routes;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.bank.BankSysytem.controllers.UserController;

public class UserRoutes {

//	public UserRoutes() {
//		// TODO Auto-generated constructor stub
//	}
//	
	@GetMapping("/v1/users")
	public String getAllUsers() {
		return UserController.getAllUsers();
	}

	@GetMapping("/v1/users/{id}")
	public String getUser(@PathVariable int id) {
		return UserController.getUser(id);
	}
	
	@PostMapping("/v1/users/")
	public void createUser(int id, String username, String password, int role) {
		UserController.createUser(id, username, password, role);
	}
	
	@DeleteMapping("/v1/users/{id}")
	public void deleteUser(@PathVariable int id) {
		UserController.deleteUser(id);
	}

}

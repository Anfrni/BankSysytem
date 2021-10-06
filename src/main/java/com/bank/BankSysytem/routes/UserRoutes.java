package com.bank.BankSysytem.routes;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bank.BankSystem.models.User;
import com.bank.BankSysytem.controllers.UserController;
import com.bank.BankSysytem.controllers.CredentialController;

@RestController
@RequestMapping("/v1")
public class UserRoutes {

	@GetMapping("/users")
	public String getAllUsers() {
		return UserController.getAllUsers();
	}

	@GetMapping("/users/{id}")
	public String getUser(@PathVariable int id) {
		return UserController.getUser(id);
	}
	
	@PostMapping("/users/")
	@ResponseBody
	public void createUser(@RequestBody User user) {
		System.out.println("User:");
		//TODO send JSON data and be able to see values printed to console
//		UserController.createUser(id, firstname, surname, phone, address);
//		CredentialController.createCredentials(id, username, password, role);
		System.out.println();
	}
	
	@DeleteMapping("/users/{id}")
	public void deleteUser(@PathVariable int id) {
		UserController.deleteUser(id);
		CredentialController.deleteCredentials(id);
	}

}

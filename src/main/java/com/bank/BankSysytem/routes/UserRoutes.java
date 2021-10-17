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
@RequestMapping("/v1/users")
public class UserRoutes {
	
	private UserController userController;
	private CredentialController credController;

	@GetMapping()
	public String getAllUsers() {
		return userController.getAllUsers();
	}

	@GetMapping("/{id}")
	public String getUser(@PathVariable Integer id) {
		return userController.getUser(id);
	}
	
	@PostMapping()
	@ResponseBody
	public void createUser(@RequestBody User user) {
		System.out.println("User:");
		// send JSON data and be able to see values printed to console
		userController.createUser(user);
	}
	
	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable Integer id) {
		userController.deleteUser(id);
		credController.deleteCredentials(id);
	}

}

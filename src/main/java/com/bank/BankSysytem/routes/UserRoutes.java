package com.bank.BankSysytem.routes;

import java.util.List;

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
	public List<User> getAllUsers() {
		return userController.getAllUsers();
	}

	@GetMapping("/{id}")
	public User getUser(@PathVariable Integer id) {
		return userController.getUser(id);
	}
	
	@PostMapping()
	@ResponseBody
	public void createUser(@RequestBody User user) {
		userController.createUser(user);
	}
	
	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable Integer id) {
		userController.deleteUser(id);
		credController.deleteCredentials(id);
	}

}

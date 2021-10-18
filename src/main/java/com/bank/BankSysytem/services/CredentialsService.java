package com.bank.BankSysytem.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.bank.BankSystem.models.Credentials;
import com.bank.BankSysytem.repositories.CredentialsRepository;

public class CredentialsService {

	@Autowired
	private CredentialsRepository repo;
	
	// create
	public void createCredentials(Credentials cred) {
		repo.save(cred);
	}
	
	// read
	public Credentials readCredentials(Integer id) {
		return repo.findById(id).get();
	}
	
	// list
	public List<Credentials> listCredentials(){
		return (List<Credentials>) repo.findAll();
	}
	
	// delete
	public void deleteCredentials(Integer id) {
		repo.deleteById(id);
	}
	
}

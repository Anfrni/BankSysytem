package com.bank.BankSysytem.controllers;

import java.util.List;

import com.bank.BankSystem.models.Credentials;
import com.bank.BankSysytem.services.CredentialsService;

public class CredentialController {
	
	private CredentialsService credServ;
	//TODO CRUD operations
	
	public void createCredentials(Credentials creds) {
		// add record to credentials database table
		credServ.createCredentials(creds);
	}
	
	public Credentials getCredentials(Integer id) {
		// list all records in credentaials database table
		return credServ.readCredentials(id);
	}
	
	public List<Credentials> getAllCredentials() {
		// list all credentials in Credentials database table
		return credServ.listCredentials();
	}
	
	public void updatePassword(Integer id, String password) {
		//TODO update password of record that matches ID
	}

	public void deleteCredentials(Integer id) {
		// delete record in credentials database that matches ID
		credServ.deleteCredentials(id);
	}
	
	public void promoteRole(Integer id, Integer newrole) {
		//TODO update role of record with matching id to newrole
	}


}

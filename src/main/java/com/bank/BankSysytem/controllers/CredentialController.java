package com.bank.BankSysytem.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.bank.BankSystem.models.Credentials;
import com.bank.BankSysytem.services.CredentialsService;

public class CredentialController {
	
	@Autowired
	private CredentialsService credServ;
	//TODO CRUD operations
	
	/**
	 * @param creds
	 * 
	 * add record to credentials database table
	 */
	public void createCredentials(Credentials creds) {
		credServ.createCredentials(creds);
	}
	
	/**
	 * @param id
	 * @return return credentials in database table associated with given id
	 */
	public Credentials getCredentials(Integer id) {
		// 
		return credServ.readCredentials(id);
	}
	
	/**
	 * @return list of all records in credentials database table
	 */
	public List<Credentials> getAllCredentials() {
		return credServ.listCredentials();
	}
	
	/**
	 * @param id
	 * @param password
	 * 
	 * update password of record that matches ID
	 */
	public void updatePassword(Integer id, String password) {
		//TODO update password of record that matches ID
	}

	/**
	 * @param id
	 * 
	 * delete record in credentials database that matches ID
	 */
	public void deleteCredentials(Integer id) {
		credServ.deleteCredentials(id);
	}
	
	/**
	 * @param id
	 * @param newrole
	 * 
	 * update role of record with matching id to newrole
	 */
	public void promoteRole(Integer id, Integer newrole) {
		//TODO update role of record with matching id to newrole
	}


}

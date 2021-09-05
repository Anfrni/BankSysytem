package com.bank.BankSysytem.controllers;

public class CredentialController {
	//TODO CRUD operations
	
	public static void createCredentials(int id, String username, String password, int role) {
		//TODO add record to credentials database table
	}
	
	public static void getCredentials(int id) {
		//TODO list all records in credentaials database table
	}
	
	public static void getAllCredentials() {
		//TODO list all credentials in Credentials database table
	}
	
	public static void updatePassword(int id, String password) {
		//TODO update password of record that matches ID
	}

	public static void deleteCredentials(int id) {
		//TODO delete record in credentials database that matches ID
	}
	
	public static void promoteRole(int id, int newrole) {
		//TODO update role of record with matching id to newrole
	}


}

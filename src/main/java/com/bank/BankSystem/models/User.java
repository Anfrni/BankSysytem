package com.bank.BankSystem.models;

import java.io.Serializable;

public class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	private int id;
	private String firstname;
	private String surname;
	private String phone;
	private String address;
	private String dateJoined;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDateJoined() {
		return dateJoined;
	}

	public void setDateJoined(String dateJoined) {
		this.dateJoined = dateJoined;
	}

	public User(int id, String firstname, String surname, String phone, String address, String dateJoined) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.surname = surname;
		this.phone = phone;
		this.address = address;
		this.dateJoined = dateJoined;
	}

	public User() {
		this(0,"", "", "","", "");
	}

	@Override
	public String toString() {
		return String.format("{'id': %d, 'firstname': '%s', 'surname': '%s', 'phone': '%s', 'address': '%s', 'dateJoined': '%s'}", id, firstname, surname, phone, address, dateJoined);
	}
	
	

}

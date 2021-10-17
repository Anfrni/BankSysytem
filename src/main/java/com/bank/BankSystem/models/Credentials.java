package com.bank.BankSystem.models;

public class Credentials implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Credentials(Integer id, String username, String password) {
		this(id, username, password, 1);
	}
	
	public Credentials(Integer id, String username, String password, Integer role) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.role = role;
	}

	private Integer id;
	private String username;
	private String password;
	private Integer role;// 1=employee, 2=Admin
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getRole() {
		return role;
	}
	public void setRole(Integer role) {
		this.role = role;
	}

}

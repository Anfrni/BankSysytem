package com.bank.BankSystem.models;

public class Transaction implements java.io.Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String action;
	private double amount;
	private String date;
	private String memo;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}	

	public Transaction(Integer id, String action, double amount, String date, String memo) {
		super();
		this.id = id;
		this.action = action;
		this.amount = amount;
		this.date = date;
		this.memo = memo;
	}

	public Transaction(Integer id, String action, double amount, String date) {
		this(id, action, amount, date, "");
	}

}

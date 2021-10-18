package com.bank.BankSystem.models;

import javax.persistence.Entity;

@Entity
public class Transaction implements java.io.Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String action;
	private Float amount;
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

	public Float getAmount() {
		return amount;
	}
	public void setAmount(Float amount) {
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

	public Transaction(Integer id, String action, Float amount, String date, String memo) {
		super();
		this.id = id;
		this.action = action;
		this.amount = amount;
		this.date = date;
		this.memo = memo;
	}

	public Transaction(Integer id, String action, Float amount, String date) {
		this(id, action, amount, date, "");
	}

}

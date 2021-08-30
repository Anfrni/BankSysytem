package com.bank.BankSystem.models;

public class Balance implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Balance() {
		this(0,0);
	}
	
	public Balance(int id, double value) {
		super();
		this.id = id;
		this.value = value;
	}

	private int id;

	private double value;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	

}

package com.bank.BankSystem.models;

public class Balance implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Balance(Integer id, Float value) {
		super();
		this.id = id;
		this.value = value;
	}

	private Integer id;

	private Float value;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Float getValue() {
		return value;
	}
	public void setValue(Float value) {
		this.value = value;
	}
	

}

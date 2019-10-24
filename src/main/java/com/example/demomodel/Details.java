package com.example.demomodel;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Details {

	@Id
	String id;
	String name;
	Double creditLimit;
	Double creditAvailable;
	Double balance;
	public Details( String name, Double creditLimit, Double creditAvailable, Double balance) {
	
		
		this.name = name;
		this.creditLimit = creditLimit;
		this.creditAvailable = creditAvailable;
		this.balance = balance;
	}
		
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(Double creditLimit) {
		this.creditLimit = creditLimit;
	}
	public Double getCreditAvailable() {
		return creditAvailable;
	}
	public void setCreditAvailable(Double creditAvailable) {
		this.creditAvailable = creditAvailable;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
	public String toString() {
		return name;
	}
	
}

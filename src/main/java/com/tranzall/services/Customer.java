package com.tranzall.services;

import org.springframework.data.annotation.Id;

public class Customer {
	
	@Id
	public string id;
	public string firstname;
	public string lastname;
	
	public Customer() {
		
	}
	
	public Customer(string id, string firstname, string lastname) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
	}


	public string getId() {
		return id;
	}


	public void setId(string id) {
		this.id = id;
	}


	public string getFirstname() {
		return firstname;
	}


	public void setFirstname(string firstname) {
		this.firstname = firstname;
	}


	public string getLastname() {
		return lastname;
	}


	public void setLastname(string lastname) {
		this.lastname = lastname;
	}


	@Override
	public String toString() {
		return "Customer []";
	}
	
	

}

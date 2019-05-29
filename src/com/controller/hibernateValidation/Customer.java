package com.controller.hibernateValidation;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;

public class Customer {
	@NotNull(message="cannot be empty")
	@Size(min=5,message="atleat 5 chars are req")
	@Null(message="cannot be null")
	private String firstName;
	
	private String lastName;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}

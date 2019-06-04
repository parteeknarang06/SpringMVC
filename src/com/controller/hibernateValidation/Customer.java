package com.controller.hibernateValidation;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customer {
	@NotNull(message="cannot be empty")
	@Size(min=5,message="atleat 5 chars are req")
	//@Null(message="cannot be null")
	private String firstName;
	private String lastName;
	@Min(message="Zero or greater than one is required", value = 1)
	@Max(message="Maximum value allowed is 10",value=10)
	@NotNull(message="is req")
	private Integer freePasses;
	@Pattern(regexp="[A-Za-z0-9]{5}", message="only 5 alphanumeric are allowed")
	private String postalCode;
	
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
	public Integer getFreePasses() {
		return freePasses;
	}
	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
}

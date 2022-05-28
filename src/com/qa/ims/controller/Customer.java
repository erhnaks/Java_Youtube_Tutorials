package com.qa.ims.controller;

public class Customer {

	private int age;
	private String firstName;
	private String lastName;


	public Customer() {
		
		
	}

	public Customer(int age, String firstName, String lastName ) {
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;	
		
	}

	
	/// source generate getters/setters
	
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

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

	
	// Source generate toString
	
	
	@Override
	public String toString() {
		return "Customer [age=" + age + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	
	
	
	
	
}


package com.codingdojo.models;

public class User {
	private String name;
	private String lastName;
	
	
	
	public User( String name, String lastName) {
		this.name = name;
		this.lastName=lastName;
		

	}
	
	public String getname() {
		return this.name;
	}

	public void setFirstName(String name) {
		this.name = name;
	}
	
	public String getlastName() {
		return this.lastName;
	}

	public void setlastName(String lastName) {
		this.lastName = lastName;
	}

}

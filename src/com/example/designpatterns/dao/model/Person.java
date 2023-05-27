package com.example.designpatterns.dao.model;

// transfer object, transfer info from one place to another
public class Person {
	private int id;
	private String name;
	private String password;
	
	public Person() {
		
	}
	
	public Person(String name, String password) {
		this.name = name;
		this.password = password;
	}
	
	public Person(int id, String name, String password) {
		this.id = id;
		this.name = name;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}

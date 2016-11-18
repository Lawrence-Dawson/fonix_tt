package com.lawrence.model;

public class User {

	private int id;
	private String forename;
	private String surname;
	private String email;
	private String password;
	
	
	public User(int id, String forename, String surname, String email, String password) {
		super();
		this.id = id;
		this.forename = forename;
		this.surname = surname;
		this.email = email;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getForename() {
		return forename;
	}
	public void setForename(String forename) {
		this.forename = forename;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}

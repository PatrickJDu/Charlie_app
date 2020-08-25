package com.anteupdating.dating_app.entity;

public class User {
	private int id;
	private String name;
	private char gender;
	private String address;
	private String email;
	private String phoneNumber;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String name, char gender, String address, String email, String phoneNumber) {
		super();
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.email = email;
		this.phoneNumber = phoneNumber;
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
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
}

package com.anteupdating.dating_app.entity;

public class User {
	private int id;
	private String firstName;
	private String middleName;
	private String lastName;
	private char gender;
	private String email;
	private String phoneNumber;
	private String dateAddress;
	private int dateRadius;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String firstName, String middleName, String lastName, char gender, String email, String phoneNumber,
			String dateAddress, int dateRadius) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.gender = gender;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.dateAddress = dateAddress;
		this.dateRadius = dateRadius;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
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
	public String getDateAddress() {
		return dateAddress;
	}
	public void setDateAddress(String dateAddress) {
		this.dateAddress = dateAddress;
	}
	public int getDateRadius() {
		return dateRadius;
	}
	public void setDateRadius(int dateRadius) {
		this.dateRadius = dateRadius;
	}
	
}

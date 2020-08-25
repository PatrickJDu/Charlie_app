package com.anteupdating.dating_app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private int id;
	@Column(name="firstName")
	private String firstName;
	@Column(name="middleName")
	private String middleName;
	@Column(name="lastName")
	private String lastName;
	@Column(name="gender")
	private char gender;
	@Column(name="email")
	private String email;
	@Column(name="phoneNumber")
	private String phoneNumber;
	@Column(name="dateAddress")
	private String dateAddress;
	@Column(name="dateRadius")
	private int dateRadius;
	@Column(name="username")
	private String username;
	@Column(name="password")
	private String password;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String firstName, String middleName, String lastName, char gender, String email, String phoneNumber,
			String username, String password, String dateAddress, int dateRadius) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.gender = gender;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.dateAddress = dateAddress;
		this.dateRadius = dateRadius;
		this.username  = username;
		this.password = password;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
}

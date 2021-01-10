package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")

public class User {
	
	@Id  //coming from javax.persistence
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int uid;
	private String userEmail;
	private String firstname;
	private String lastname;
	private String password;
	
	public User() {
		
	}
	
	
	public User(String userEmail, String firstname, String lastname,String password) {
		super();
		this.userEmail = userEmail;
		this.firstname = firstname;
		this.lastname = lastname;
		//this.age = age;
		this.password = password;
	}
	
	
	public int getUid() {
		return uid;
	}


	public void setUid(int uid) {
		this.uid = uid;
	}


	public String getUserEmail() {
		return userEmail;
	}


	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}


	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [id=" + uid + ", userEmail=" +userEmail + ", firstname=" + firstname + ", lastname=" + lastname
				+  ", password=" + password + "]";
	}}
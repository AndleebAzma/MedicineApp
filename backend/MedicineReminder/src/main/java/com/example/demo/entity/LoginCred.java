package com.example.demo.entity;

public class LoginCred {
	
	private String emailId;
	private String password;
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LoginCred() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoginCred(String emailId, String password) {
		super();
		this.emailId = emailId;
		this.password = password;
	}
	

}

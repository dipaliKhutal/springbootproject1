package com.example.demo.dto;

public class UserLogindto {
	private String email;
	private String password;
	public UserLogindto() {
		super();
	}
	public UserLogindto(String email, String password) {
		super();
		this.email = email;
		this.password = password;
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
	@Override
	public String toString() {
		return "UserLogindto [email=" + email + ", password=" + password + "]";
	}
	
	

}

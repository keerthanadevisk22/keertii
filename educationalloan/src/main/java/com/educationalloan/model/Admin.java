package com.educationalloan.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Admin {
	@Id
	private String email;
	private String password;
	private String mobilenumber;
	private String userrole;
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
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getUserrole() {
		return userrole;
	}
	public void setUserrole(String userrole) {
		this.userrole = userrole;
	}
	public Admin(String email, String password, String mobilenumber, String userrole) {
		super();
		this.email = email;
		this.password = password;
		this.mobilenumber = mobilenumber;
		this.userrole = userrole;
	}
	public Admin() {
		super();
	}
}

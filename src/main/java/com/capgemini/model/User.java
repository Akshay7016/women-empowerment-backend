package com.capgemini.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_table")
public class User {
	
	@Id
	@Column(name="login_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int loginId;
	
	@Column(name="user_name")
	private String userName;
	
	@Column(name="password")
	private String userPassword;
	
	@Column(name="role")
	private Role role;

	public User() {
		super();
		
	}

	public User(int loginId, String userName, String userPassword, Role role) {
		super();
		this.loginId = loginId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.role = role;
	}

	public int getLoginId() {
		return loginId;
	}

	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [loginId=" + loginId + ", userName=" + userName + ", userPassword=" + userPassword + ", role="
				+ role + "]";
	}

	

	

	
	
	
	
	
}

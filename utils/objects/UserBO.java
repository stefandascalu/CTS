package com.ptt.cts.tests.utils.objects;

import java.sql.Timestamp;

import com.ptt.cts.tests.utils.PTTObject;

public class UserBO implements PTTObject {
	private int userId;
	private String firstname;
	private String lastname;
	private String username;
	private String password;
	private Timestamp createdDate;
	private String createdBy;
	private String image;

	public UserBO() {

	}

	public UserBO(int userId, String firstname, String lastname, String username, String password,
			Timestamp createdDate, String createdBy, String image) {
		super();
		this.userId = userId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.password = password;
		this.createdDate = createdDate;
		this.createdBy = createdBy;
		this.image = image;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Timestamp getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "UserBO [userId=" + userId + ", firstname=" + firstname + ", lastname=" + lastname + ", username="
				+ username + ", password=" + password + ", createdDate=" + createdDate + ", createdBy=" + createdBy
				+ ", image=" + image + "]";
	}

}

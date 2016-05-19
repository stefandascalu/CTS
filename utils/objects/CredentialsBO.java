package com.ptt.cts.tests.utils.objects;

import com.ptt.cts.tests.utils.PTTObject;

public class CredentialsBO implements PTTObject {
	private String username;
	private String password;

	public CredentialsBO() {

	}

	public CredentialsBO(String username, String password) {
		super();
		this.username = username;
		this.password = password;
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

}

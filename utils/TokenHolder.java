package com.ptt.cts.tests.utils;

/**
 * Singleton class to hold the token
 * @author stefandascalu
 *
 */
public class TokenHolder {
	private static TokenHolder instance = null;
	private String token;
	
	private TokenHolder(){
		
	}
	
	public static TokenHolder getInstance(){
		if(instance == null){
			instance = new TokenHolder();
		}
		return instance;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
	
}

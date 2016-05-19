package com.ptt.cts.tests.loginResource;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.Test;

import com.google.gson.Gson;
import com.ptt.cts.tests.utils.PTTResponse;
import com.ptt.cts.tests.utils.RestClient;
import com.ptt.cts.tests.utils.TokenHolder;
import com.ptt.cts.tests.utils.objects.CredentialsBO;
import com.ptt.cts.tests.utils.response.LoginResponse;

public class PositiveLoginSameToken {
	private static RestClient restClient;
	private static final String loginUrl = "http://localhost:9080/AgileProjMngTool/rest/authentication";
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		restClient = new RestClient(loginUrl);
	}

	@Test
	public void test() {
		CredentialsBO credentialsBO = new CredentialsBO("sdascalu@yahoo.com", "Stefan_1234");
		try {
			PTTResponse response = restClient.doRequest("application/json", null, credentialsBO, false, "POST");
			TokenHolder tokenHolder = TokenHolder.getInstance();
			String currentToken = tokenHolder.getToken();
			Gson gson = new Gson();
			LoginResponse loginResponse = gson.fromJson(response.getContentBody(), LoginResponse.class);
			assertEquals(currentToken, loginResponse.getToken());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

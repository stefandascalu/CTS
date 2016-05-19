package com.ptt.cts.tests.loginResource;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.Test;

import com.ptt.cts.tests.utils.PTTResponse;
import com.ptt.cts.tests.utils.RestClient;
import com.ptt.cts.tests.utils.objects.CredentialsBO;

public class NegativeLoginPassUser {
	private static RestClient restClient;
	private static final String loginUrl = "http://localhost:9080/AgileProjMngTool/rest/authentication";

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		restClient = new RestClient(loginUrl);
	}

	@Test
	public void test() {
		CredentialsBO credentialsBO = new CredentialsBO("mdascalu@yahoo.com", "Stefan_123445454");
		try {
			PTTResponse response = restClient.doRequest("application/json", null, credentialsBO, false, "POST");
			assertEquals(401, response.getResponseCode());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

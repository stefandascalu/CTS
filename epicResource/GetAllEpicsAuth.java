package com.ptt.cts.tests.epicResource;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.Test;

import com.ptt.cts.tests.utils.PTTResponse;
import com.ptt.cts.tests.utils.RestClient;
import com.ptt.cts.tests.utils.TokenHolder;

public class GetAllEpicsAuth {

	private static final String getEpicLink = "http://localhost:9080/AgileProjMngTool/rest/epic";
	private static RestClient restClient;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		restClient = new RestClient(getEpicLink);
	}

	@Test
	public void test() {
		try {
			TokenHolder tokenHolder = TokenHolder.getInstance();
			String token = tokenHolder.getToken();
			PTTResponse response = restClient.doRequest("application/json", token, null, true, "GET");
			System.out.println(response);
			if (response.getResponseCode() == 200) {
				assertNotNull(response.getContentBody());
			} else {
				fail("This test case should be run after a login attempt. Run it using the provided TestSuite in the package");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

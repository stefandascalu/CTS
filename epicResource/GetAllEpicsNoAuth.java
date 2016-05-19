package com.ptt.cts.tests.epicResource;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.Test;

import com.ptt.cts.tests.utils.PTTResponse;
import com.ptt.cts.tests.utils.RestClient;


public class GetAllEpicsNoAuth {
	
	private static final String getEpicLink = "http://localhost:9080/AgileProjMngTool/rest/epic";
	private static RestClient restClient;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		restClient = new RestClient(getEpicLink);
	}

	@Test
	public void test() {
		try {
			PTTResponse response = restClient.doRequest("application/json", null, null, false, "GET");
			assertEquals(401, response.getResponseCode());

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

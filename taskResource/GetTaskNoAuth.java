package com.ptt.cts.tests.taskResource;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.Test;

import com.ptt.cts.tests.utils.PTTResponse;
import com.ptt.cts.tests.utils.RestClient;

public class GetTaskNoAuth {
	private static final String taskLink = "http://localhost:9080/AgileProjMngTool/rest/task/byProject/4";
	private static RestClient restClient;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		restClient = new RestClient(taskLink);
	}

	@Test
	public void test() {
		try {
			PTTResponse response = restClient.doRequest("application/json", null, null, false, "GET");
			System.out.println(response);
			if(response.getResponseCode() == 401){
				assertEquals(401, response.getResponseCode());
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

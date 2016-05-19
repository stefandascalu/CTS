package com.ptt.cts.tests.epicResource;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ptt.cts.tests.utils.PTTResponse;
import com.ptt.cts.tests.utils.RestClient;
import com.ptt.cts.tests.utils.TokenHolder;
import com.ptt.cts.tests.utils.objects.EpicBO;


public class AddSingleEpic {
	private static final String getProjectLink = "http://localhost:9080/AgileProjMngTool/rest/epic";
	private static RestClient restClient;
	private static EpicBO epicBO;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		restClient = new RestClient(getProjectLink);
		epicBO = new EpicBO(0, "Epic Junit Single", "Epic Junit Single", 4, 1, "2016-05-16", "2016-05-16", 1, 1, 1, "junitTest", null);
		
	}

	@Test
	public void test() {
		try {
			TokenHolder tokenHolder = TokenHolder.getInstance();
			String token = tokenHolder.getToken();
			PTTResponse response = restClient.doRequest("application/json", token, epicBO, true, "POST");
			System.out.println(response);
			if(response.getResponseCode() == 204){
				assertEquals(204, response.getResponseCode());
			}
			else{
				fail("This test case should be run after a login attempt. Run it using the provided TestSuite in the package");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@AfterClass
	public static void tearDownAfterClass(){
		epicBO = null;
		assertNull(epicBO);
	}
}

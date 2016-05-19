package com.ptt.cts.tests.projectResource;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ptt.cts.tests.utils.PTTResponse;
import com.ptt.cts.tests.utils.RestClient;
import com.ptt.cts.tests.utils.TokenHolder;
import com.ptt.cts.tests.utils.objects.ProjectBO;

public class InsertSingleProject {
	private static final String getProjectLink = "http://localhost:9080/AgileProjMngTool/rest/project";
	private static RestClient restClient;
	private static ProjectBO projectBO;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		restClient = new RestClient(getProjectLink);
		projectBO = new ProjectBO("Test Junit Single", "Test Junit Single", 1, "2016-05-19", "2016-05-11", "sdascalu@yahoo.com");
	}

	@Test
	public void test() {
		try {
			TokenHolder tokenHolder = TokenHolder.getInstance();
			String token = tokenHolder.getToken();
			PTTResponse response = restClient.doRequest("application/json", token, projectBO, true, "POST");
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
		projectBO = null;
		assertNull(projectBO);
	}
}

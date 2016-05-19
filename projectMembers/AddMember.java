package com.ptt.cts.tests.projectMembers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ptt.cts.tests.utils.PTTResponse;
import com.ptt.cts.tests.utils.RestClient;
import com.ptt.cts.tests.utils.TokenHolder;
import com.ptt.cts.tests.utils.objects.ProjectUsersBO;

public class AddMember {
	private static final String getProjectLink = "http://localhost:9080/AgileProjMngTool/rest/project/member";
	private static RestClient restClient;
	private static ProjectUsersBO projectUsersBO;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		restClient = new RestClient(getProjectLink);
		projectUsersBO = new ProjectUsersBO(0, 1, 1);
	}

	@Test
	public void test() {
		try {
			TokenHolder tokenHolder = TokenHolder.getInstance();
			String token = tokenHolder.getToken();
			PTTResponse response = restClient.doRequest("application/json", token, projectUsersBO, true, "POST");
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
		projectUsersBO = null;
		assertNull(projectUsersBO);
	}
}

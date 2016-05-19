package com.ptt.cts.tests.userResource;

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
import com.ptt.cts.tests.utils.objects.UserBO;

public class AddSingleUser {
	private static final String getProjectLink = "http://localhost:9080/AgileProjMngTool/rest/user";
	private static RestClient restClient;
	private static UserBO userBO;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		restClient = new RestClient(getProjectLink);
		userBO = new UserBO(0, "Junit", "Test", "junitTest@eclipse.com", "Junit_1234", null, null, null);
	}

	@Test
	public void test() {
		try {
			TokenHolder tokenHolder = TokenHolder.getInstance();
			String token = tokenHolder.getToken();
			PTTResponse response = restClient.doRequest("application/json", token, userBO, true, "POST");
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
		userBO = null;
		assertNull(userBO);
	}
}

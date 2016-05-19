package com.ptt.cts.tests.userStoryResource;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.Test;

import com.ptt.cts.tests.utils.PTTResponse;
import com.ptt.cts.tests.utils.RestClient;
import com.ptt.cts.tests.utils.TokenHolder;
import com.ptt.cts.tests.utils.objects.UserStoryBO;

public class NegativeInsertSingleUserStory {
	private static final String userStoryLink = "http://localhost:9080/AgileProjMngTool/rest/userstory";
	private static RestClient restClient;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		restClient = new RestClient(userStoryLink);
	}

	@Test
	public void test() {
		try {
			TokenHolder tokenHolder = TokenHolder.getInstance();
			String token = tokenHolder.getToken();
			UserStoryBO userStoryBO = new UserStoryBO(0, "Junit Single 1", "Junit Single 1", 7656, 1, 1, "2016-05-19", "2016-05-19", 1, 1, null, null);
			PTTResponse response = restClient.doRequest("application/json", token, userStoryBO, true, "POST");
			System.out.println(response);
			if(response.getResponseCode() == 500){
				assertEquals(500, response.getResponseCode());
			}
			else{
				fail("This test case should be run after a login attempt. Run it using the provided TestSuite in the package");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

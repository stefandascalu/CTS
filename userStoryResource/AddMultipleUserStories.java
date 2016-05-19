package com.ptt.cts.tests.userStoryResource;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ptt.cts.tests.utils.PTTResponse;
import com.ptt.cts.tests.utils.RestClient;
import com.ptt.cts.tests.utils.TokenHolder;
import com.ptt.cts.tests.utils.objects.UserStoryBO;

public class AddMultipleUserStories {
	private static final String userStoryLink = "http://localhost:9080/AgileProjMngTool/rest/userstory";
	private static RestClient restClient;
	private static List<UserStoryBO> userStoryList = new ArrayList<>();
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		restClient = new RestClient(userStoryLink);
		File file = new File("userstories.txt");
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			String line;
			while((line = br.readLine()) != null){
				String [] lineSplit = line.split(",");
				UserStoryBO userStoryBO = new UserStoryBO();
				userStoryBO.setUserStoryName(lineSplit[0]);
				userStoryBO.setUserStoryDescription(lineSplit[1]);
				userStoryBO.setProjectId(Integer.valueOf(lineSplit[2].trim()));
				userStoryBO.setOwnerId(Integer.valueOf(lineSplit[3].trim()));
				userStoryBO.setEpicId(Integer.valueOf(lineSplit[4].trim()));
				userStoryBO.setStartDate(lineSplit[5]);
				userStoryBO.setEndDate(lineSplit[5]);
				userStoryBO.setPriority(Integer.valueOf(lineSplit[6].trim()));
				userStoryBO.setSeverity(Integer.valueOf(lineSplit[7].trim()));
				userStoryList.add(userStoryBO);
			}
		}
	}

	@Test
	public void test() {
		try {
			TokenHolder tokenHolder = TokenHolder.getInstance();
			String token = tokenHolder.getToken();
			int counter = 0;
			for(UserStoryBO userStoryBO : userStoryList){
				PTTResponse response = restClient.doRequest("application/json", token, userStoryBO, true, "POST");
				if(response.getResponseCode() != 204){
					fail("This test case should be run after a login attempt. Run it using the provided TestSuite in the package");
				}
				counter++;
			}
			
			assertEquals(userStoryList.size(), counter);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@AfterClass
	public static void tearDownAfterClass(){
		userStoryList.removeAll(userStoryList);
	}
}

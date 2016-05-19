package com.ptt.cts.tests.epicResource;

import static org.junit.Assert.*;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;


import org.junit.BeforeClass;
import org.junit.Test;

import com.google.gson.Gson;
import com.ptt.cts.tests.utils.PTTResponse;
import com.ptt.cts.tests.utils.RestClient;
import com.ptt.cts.tests.utils.TokenHolder;
import com.ptt.cts.tests.utils.objects.EpicBO;

import com.google.gson.reflect.TypeToken;

public class GetEpicForProjectId {
	private static final String getEpicLink = "http://localhost:9080/AgileProjMngTool/rest/epic/project/4";
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
			if(response.getResponseCode() != 200){
				fail("This test case should be run after a login attempt. Run it using the provided TestSuite in the package");
			}
			System.out.println(response);
			Gson gson = new Gson();
			Type listType = new TypeToken<List<EpicBO>>(){}.getType(); 
			List<EpicBO> epicList = gson.fromJson(response.getContentBody(), listType);
			int counter = 0;
			for(EpicBO epic : epicList){
				if(epic.getProjectId() != 4){
					fail("Not all epic belong to this project");
				}
				counter++;
			}
			assertEquals(epicList.size(), counter);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

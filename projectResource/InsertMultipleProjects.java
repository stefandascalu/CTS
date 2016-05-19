package com.ptt.cts.tests.projectResource;

import static org.junit.Assert.*;

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
import com.ptt.cts.tests.utils.objects.ProjectBO;

public class InsertMultipleProjects {

	private static final String getProjectLink = "http://localhost:9080/AgileProjMngTool/rest/project";
	private static RestClient restClient;
	private static List<ProjectBO> projectList = new ArrayList<>();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		restClient = new RestClient(getProjectLink);
		File file = new File("projects.txt");
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] lineSplit = line.split(",");
				ProjectBO project = new ProjectBO();
				project.setProjectName(lineSplit[0]);
				project.setProjectDescription(lineSplit[1]);
				project.setProjectOwnerId(Integer.valueOf(lineSplit[2].trim()));
				project.setStartDate(lineSplit[3]);
				project.setEndDate(lineSplit[3]);
				project.setCreatedBy("junitTest");
				projectList.add(project);
			}
		}
	}

	@Test
	public void test() {
		try {
			TokenHolder tokenHolder = TokenHolder.getInstance();
			String token = tokenHolder.getToken();
			int counter = 0;
			for (ProjectBO projectBO : projectList) {
				PTTResponse response = restClient.doRequest("application/json", token, projectBO, true, "POST");
				if (response.getResponseCode() != 204) {
					fail("This test case should be run after a login attempt. Run it using the provided TestSuite in the package");
				}
				counter++;
			}

			assertEquals(projectList.size(), counter);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@AfterClass
	public static void tearDownAfterClass() {
		projectList.removeAll(projectList);
	}
}

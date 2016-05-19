package com.ptt.cts.tests.project;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ptt.cts.patterns.facede.ProjectManager;
import com.ptt.entity.Project;

public class AddProjectPositive {
	private static List<Project> projectsList = new ArrayList<>();
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		File file = new File("projects.txt");
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			String line;
			while((line = br.readLine()) != null){
				String [] lineSplit = line.split(",");
				Project project = new Project();
				project.setProjectName(lineSplit[0]);
				project.setProjectDescription(lineSplit[1]);
				project.setProjectOwnerId(Integer.valueOf(lineSplit[2].trim()));
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				java.util.Date date = sdf.parse(lineSplit[3]);
				project.setStartDate(new Date(date.getTime()));
				project.setEndDate(new Date(date.getTime()));
				project.setCreatedBy("junitTest");
				projectsList.add(project);
			}
		}
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	/**
	 * This is a positive test for entering projects in the DB from a file
	 */
	@Test
	public void test() {
		for(Project project : projectsList){
			ProjectManager projectManager = new ProjectManager();
			try{
				Project toTest = projectManager.persistProjectToDB(project);
				assertThat(toTest.getProjectId(), is(not(equalTo(0))));
			}
			catch(Exception ex){
				assertFalse(true);
			}
		}
	}

}


package com.ptt.cts.tests.patternsTest;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.sql.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.ptt.cts.patterns.facede.FacadeImpl;
import com.ptt.entity.Epic;
import com.ptt.entity.Project;
import com.ptt.entity.Task;
import com.ptt.entity.UserStory;
import com.ptt.enums.Priority;
import com.ptt.enums.Severity;

public class PositiveFacadeTest {
	private static Project project = null;
	private static Epic epic = null;
	private static UserStory userStory = null;
	private static Task task = null;
	

	@SuppressWarnings("deprecation")
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		project = new Project();
		project.setProjectName("TEST MAIN");
		project.setProjectDescription("TEST MAIN");
		project.setProjectOwnerId(1);
		project.setStartDate(new Date(2016, 05, 15));
		project.setEndDate(new Date(2016, 06, 16));
		project.setCreatedBy("junitTest");
		
		epic = new Epic();
		epic.setEpicName("Test EPIC");
		epic.setEpicDescription("Test Epic Description");
		epic.setOwnerId(1);
		epic.setStartDate(new Date(2016, 05, 15));
		epic.setEndDate(new Date(2016, 06, 16));
		epic.setPoints(5);
		epic.setPriority(Priority.HIGH_PRIORITY.getId());
		epic.setSeverity(Severity.CRITICAL_SEVERITY.getId());
		epic.setCreatedBy("junitTest");
		
		userStory = new UserStory();
		userStory.setUserStoryName("test user story");
		userStory.setUserStoryDescription("test user story");
		userStory.setOwnerId(1);
		userStory.setStartDate(new Date(2016, 05, 15));
		userStory.setEndDate(new Date(2016, 06, 15));
		userStory.setPriority(Priority.HIGH_PRIORITY.getId());
		userStory.setSeverity(Severity.CRITICAL_SEVERITY.getId());
		userStory.setCreatedBy("junitTest");
		
		task = new Task();
		task.setTaskName("Test Task");
		task.setTaskDescription("test task");
		task.setOwnerId(1);
		task.setStartDate(new Date(2016, 05, 15));
		task.setEndDate(new Date(2016, 06, 15));
		task.setPriority(Priority.HIGH_PRIORITY.getId());
		task.setSeverity(Severity.CRITICAL_SEVERITY.getId());
		task.setCreatedBy("junitTest");
	}

	@Test
	public void test() {
		FacadeImpl facade = new FacadeImpl();
		int taskId = facade.addTask(project, epic, userStory, task);
		assertThat(taskId, is(not(equalTo(0))));
	}

}

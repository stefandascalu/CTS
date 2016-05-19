package com.ptt.cts.tests.patternsTest;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.sql.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ptt.cts.patterns.facede.TaskManager;
import com.ptt.cts.patterns.observer.NotifiedUser;
import com.ptt.entity.Task;
import com.ptt.enums.Priority;
import com.ptt.enums.Severity;

public class ObserverTest {
	private final ByteArrayOutputStream outStream = new ByteArrayOutputStream();
	
	private static Task task = null;
	

	@SuppressWarnings("deprecation")
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		task = new Task();
		task.setTaskName("Test Task");
		task.setTaskDescription("test task");
		task.setOwnerId(1);
		task.setProjectId(4);
		task.setUserStoryId(1);
		task.setStartDate(new Date(2016, 05, 15));
		task.setEndDate(new Date(2016, 06, 15));
		task.setPriority(Priority.HIGH_PRIORITY.getId());
		task.setSeverity(Severity.CRITICAL_SEVERITY.getId());
		task.setCreatedBy("junitTest");
	}
	
	@Before
	public void prepareStream(){
		System.setOut(new PrintStream(outStream));
	}
	@Test
	public void test() {
		TaskManager taskManager = new TaskManager();
		NotifiedUser user = new NotifiedUser();
		taskManager.persistTaskToDB(task);
		taskManager.addObserver(user);
		taskManager.notifyUser("New Task");
		assertEquals(true, outStream.toString().contains("New Task"));
	}
	
	@After
	public void cleanStream(){
		System.setOut(null);
	}
}

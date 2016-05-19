package com.ptt.cts.tests.taskResource;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.ptt.cts.tests.loginResource.PositiveLogin;

@RunWith(Suite.class)
@SuiteClasses({ PositiveLogin.class, GetAllTasksByProjectId.class, GetAllTasksByUserStoryId.class, GetTaskNoAuth.class, AddTask.class })
public class TaskTests {

}

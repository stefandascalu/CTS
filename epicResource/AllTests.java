package com.ptt.cts.tests.epicResource;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.ptt.cts.tests.loginResource.LoginTests;
import com.ptt.cts.tests.patternsTest.BuilderTest;
import com.ptt.cts.tests.patternsTest.ObserverTest;
import com.ptt.cts.tests.patternsTest.PositiveFacadeTest;
import com.ptt.cts.tests.projectMembers.MembersTest;
import com.ptt.cts.tests.projectResource.ProjectTests;
import com.ptt.cts.tests.taskResource.TaskTests;
import com.ptt.cts.tests.userResource.UserTests;
import com.ptt.cts.tests.userStoryResource.UserStoryTest;

@RunWith(Suite.class)
@SuiteClasses({ LoginTests.class, UserTests.class, ProjectTests.class, MembersTest.class, EpicTests.class,
		UserStoryTest.class, TaskTests.class, BuilderTest.class, ObserverTest.class, PositiveFacadeTest.class})
public class AllTests {

}

package com.ptt.cts.tests.projectResource;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.ptt.cts.tests.loginResource.PositiveLogin;

@RunWith(Suite.class)
@SuiteClasses({ PositiveLogin.class, GetAllProjectsGoodToken.class, PositiveGetProjectById.class,
		NegativeGetProjectById.class, InsertSingleProject.class, InsertMultipleProjects.class })
public class ProjectTests {

}

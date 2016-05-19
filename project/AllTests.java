package com.ptt.cts.tests.project;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AddProjectNegative.class, AddProjectPositive.class, LoadChildEntities.class })
public class AllTests {

}

package com.ptt.cts.tests.epicResource;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.ptt.cts.tests.loginResource.PositiveLogin;

@RunWith(Suite.class)
@SuiteClasses({ PositiveLogin.class, GetAllEpicsAuth.class, GetAllEpicsNoAuth.class, GetEpicForProjectId.class,
		AddSingleEpic.class, GetEpicSummary.class })
public class EpicTests {

}

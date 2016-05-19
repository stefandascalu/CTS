package com.ptt.cts.tests.loginResource;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ NegativeLoginPassUser.class, NegativeLoginPassword.class, NegativeLoginUser.class, PositiveLogin.class,
		PositiveLoginSameToken.class })
public class LoginTests {

}

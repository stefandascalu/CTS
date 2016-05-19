package com.ptt.cts.tests.userResource;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.ptt.cts.tests.loginResource.PositiveLogin;

@RunWith(Suite.class)
@SuiteClasses({ PositiveLogin.class, GetAllUsers.class, GetUserById.class, AddSingleUser.class })
public class UserTests {

}

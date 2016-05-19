package com.ptt.cts.tests.userStoryResource;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.ptt.cts.tests.loginResource.PositiveLogin;

@RunWith(Suite.class)
@SuiteClasses({ PositiveLogin.class, GetAllUserStories.class, GetUserStoryById.class, AddMultipleUserStories.class,
		NegativeInsertSingleUserStory.class })
public class UserStoryTest {

}

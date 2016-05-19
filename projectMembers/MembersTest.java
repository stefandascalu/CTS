package com.ptt.cts.tests.projectMembers;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.ptt.cts.tests.loginResource.PositiveLogin;

@RunWith(Suite.class)
@SuiteClasses({ PositiveLogin.class, AddMember.class, NegativeAddMemberProjectFK.class, NegativeAddMemberUserFK.class,
		NegativeAddMemberBothFK.class })
public class MembersTest {

}

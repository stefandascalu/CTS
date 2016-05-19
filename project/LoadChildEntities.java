package com.ptt.cts.tests.project;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.ptt.cts.patterns.facede.ProjectManager;
import com.ptt.entity.Project;
import com.ptt.entity.User;

public class LoadChildEntities {


	@Test
	public void test() {
		ProjectManager projectService = new ProjectManager();
		Project project = projectService.getProjectById(4);	
		List<User> membersList = project.getMembersList();
		assertTrue(!membersList.isEmpty());
	}

}

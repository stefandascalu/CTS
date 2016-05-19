package com.ptt.cts.tests.utils.objects;

import com.ptt.cts.tests.utils.PTTObject;

public class ProjectUsersBO implements PTTObject {
	private int projectUsersId;
	private int projectId;
	private int userId;

	public ProjectUsersBO() {

	}

	public ProjectUsersBO(int projectUsersId, int projectId, int userId) {
		super();
		this.projectUsersId = projectUsersId;
		this.projectId = projectId;
		this.userId = userId;
	}

	public int getProjectUsersId() {
		return projectUsersId;
	}

	public void setProjectUsersId(int projectUsersId) {
		this.projectUsersId = projectUsersId;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "ProjectUsersBO [projectUsersId=" + projectUsersId + ", projectId=" + projectId + ", userId=" + userId
				+ "]";
	}

}

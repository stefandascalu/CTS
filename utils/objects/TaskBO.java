package com.ptt.cts.tests.utils.objects;

import com.ptt.cts.tests.utils.PTTObject;

public class TaskBO implements PTTObject {
	private int taskId;
	private String taskName;
	private String taskDescription;
	private int userStoryId;
	private int projectId;
	private int ownerId;
	private String startDate;
	private String endDate;
	private int priority;
	private int severity;
	private String createdBy;
	private String createdDate;

	public TaskBO() {

	}

	public TaskBO(int taskId, String taskName, String taskDescription, int userStoryId, int projectId, int ownerId,
			String startDate, String endDate, int priority, int severity, String createdBy, String createdDate) {
		super();
		this.taskId = taskId;
		this.taskName = taskName;
		this.taskDescription = taskDescription;
		this.userStoryId = userStoryId;
		this.projectId = projectId;
		this.ownerId = ownerId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.priority = priority;
		this.severity = severity;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
	}

	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getTaskDescription() {
		return taskDescription;
	}

	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}

	public int getUserStoryId() {
		return userStoryId;
	}

	public void setUserStoryId(int userStoryId) {
		this.userStoryId = userStoryId;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public int getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public int getSeverity() {
		return severity;
	}

	public void setSeverity(int severity) {
		this.severity = severity;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	@Override
	public String toString() {
		return "TaskBO [taskId=" + taskId + ", taskName=" + taskName + ", taskDescription=" + taskDescription
				+ ", userStoryId=" + userStoryId + ", projectId=" + projectId + ", ownerId=" + ownerId + ", startDate="
				+ startDate + ", endDate=" + endDate + ", priority=" + priority + ", severity=" + severity
				+ ", createdBy=" + createdBy + ", createdDate=" + createdDate + "]";
	}

}

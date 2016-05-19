package com.ptt.cts.tests.utils.objects;

import com.ptt.cts.tests.utils.PTTObject;

public class UserStoryBO implements PTTObject {
	private int userStoryId;
	private String userStoryName;
	private String userStoryDescription;
	private int projectId;
	private int ownerId;
	private int epicId;
	private String startDate;
	private String endDate;
	private int priority;
	private int severity;
	private String createdBy;
	private String createdDate;

	public UserStoryBO() {

	}

	public UserStoryBO(int userStoryId, String userStoryName, String userStoryDescription, int projectId, int ownerId,
			int epicId, String startDate, String endDate, int priority, int severity, String createdBy,
			String createdDate) {
		super();
		this.userStoryId = userStoryId;
		this.userStoryName = userStoryName;
		this.userStoryDescription = userStoryDescription;
		this.projectId = projectId;
		this.ownerId = ownerId;
		this.epicId = epicId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.priority = priority;
		this.severity = severity;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
	}

	public int getUserStoryId() {
		return userStoryId;
	}

	public void setUserStoryId(int userStoryId) {
		this.userStoryId = userStoryId;
	}

	public String getUserStoryName() {
		return userStoryName;
	}

	public void setUserStoryName(String userStoryName) {
		this.userStoryName = userStoryName;
	}

	public String getUserStoryDescription() {
		return userStoryDescription;
	}

	public void setUserStoryDescription(String userStoryDescription) {
		this.userStoryDescription = userStoryDescription;
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

	public int getEpicId() {
		return epicId;
	}

	public void setEpicId(int epicId) {
		this.epicId = epicId;
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
		return "UserStoryBO [userStoryId=" + userStoryId + ", userStoryName=" + userStoryName
				+ ", userStoryDescription=" + userStoryDescription + ", projectId=" + projectId + ", ownerId=" + ownerId
				+ ", epicId=" + epicId + ", startDate=" + startDate + ", endDate=" + endDate + ", priority=" + priority
				+ ", severity=" + severity + ", createdBy=" + createdBy + ", createdDate=" + createdDate + "]";
	}

}

package com.ptt.cts.tests.utils.objects;

import java.io.Serializable;

import com.ptt.cts.tests.utils.PTTObject;

public class EpicBO implements PTTObject, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int epicId;
	private String epicName;
	private String epicDescription;
	private int projectId;
	private int ownerId;
	private String startDate;
	private String endDate;
	private int points;
	private int priority;
	private int severity;
	private String createdBy;
	private String createdDate;

	public EpicBO() {

	}

	public EpicBO(int epicId, String epicName, String epicDescription, int projectId, int ownerId, String startDate,
			String endDate, int points, int priority, int severity, String createdBy, String createdDate) {
		super();
		this.epicId = epicId;
		this.epicName = epicName;
		this.epicDescription = epicDescription;
		this.projectId = projectId;
		this.ownerId = ownerId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.points = points;
		this.priority = priority;
		this.severity = severity;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
	}

	public int getEpicId() {
		return epicId;
	}

	public void setEpicId(int epicId) {
		this.epicId = epicId;
	}

	public String getEpicName() {
		return epicName;
	}

	public void setEpicName(String epicName) {
		this.epicName = epicName;
	}

	public String getEpicDescription() {
		return epicDescription;
	}

	public void setEpicDescription(String epicDescription) {
		this.epicDescription = epicDescription;
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

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
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
		return "EpicBO [epicId=" + epicId + ", epicName=" + epicName + ", epicDescription=" + epicDescription
				+ ", projectId=" + projectId + ", ownerId=" + ownerId + ", startDate=" + startDate + ", endDate="
				+ endDate + ", points=" + points + ", priority=" + priority + ", severity=" + severity + ", createdBy="
				+ createdBy + ", createdDate=" + createdDate + "]";
	}

}

package com.ptt.cts.tests.utils.objects;

import com.ptt.cts.tests.utils.PTTObject;

/**
 * Bean that will be used for the call to the project endpoint
 * 
 * @author stefandascalu
 *
 */
public class ProjectBO implements PTTObject {
	private String projectName;
	private String projectDescription;
	private int projectOwnerId;
	private String startDate;
	private String endDate;
	private String createdBy;

	public ProjectBO() {

	}

	public ProjectBO(String projectName, String projectDescription, int projectOwnerId, String startDate,
			String endDate, String createdBy) {
		super();
		this.projectName = projectName;
		this.projectDescription = projectDescription;
		this.projectOwnerId = projectOwnerId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.createdBy = createdBy;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectDescription() {
		return projectDescription;
	}

	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}

	public int getProjectOwnerId() {
		return projectOwnerId;
	}

	public void setProjectOwnerId(int projectOwnerId) {
		this.projectOwnerId = projectOwnerId;
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

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	@Override
	public String toString() {
		return "ProjectBO [projectName=" + projectName + ", projectDescription=" + projectDescription
				+ ", projectOwnerId=" + projectOwnerId + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", createdBy=" + createdBy + "]";
	}

}

package com.ShanInfotech.WorkLogTrackerApp.entity;

public class Project {
	private int projectId;
	private String projectName;
	private String startDate;
	
	public Project () {
		
	}

	public Project(int projectId, String projectName, String startDate) {
		this.projectId = projectId;
		this.projectName = projectName;
		this.startDate = startDate;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName=" + projectName + ", startDate=" + startDate + "]";
	}
	
	
	
	

}

package com.ShanInfotech.WorkLogTrackerApp.entity;

public class Sprint {
	private int sprintId;
	private String sprintName;
	private String startDate;
	private String endDate;
	private Project projectId;
	
	
	public Sprint() {
		
	}


	public Sprint(int sprintId, String sprintName, String startDate, String endDate, Project projectId) {
		this.sprintId = sprintId;
		this.sprintName = sprintName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.projectId = projectId;
	}


	public int getSprintId() {
		return sprintId;
	}


	public void setSprintId(int sprintId) {
		this.sprintId = sprintId;
	}


	public String getSprintName() {
		return sprintName;
	}


	public void setSprintName(String sprintName) {
		this.sprintName = sprintName;
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


	public Project getProjectId() {
		return projectId;
	}


	public void setProjectId(Project projectId) {
		this.projectId = projectId;
	}


	@Override
	public String toString() {
		return "Sprint [sprintId=" + sprintId + ", sprintName=" + sprintName + ", startDate=" + startDate + ", endDate="
				+ endDate + ", projectId=" + projectId + "]";
	}


}
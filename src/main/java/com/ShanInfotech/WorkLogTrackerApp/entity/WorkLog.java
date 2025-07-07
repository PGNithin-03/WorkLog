package com.ShanInfotech.WorkLogTrackerApp.entity;

public class WorkLog {
	private int worklogId;
	private String monthYear;
	private double hoursWorked;
	private Employe employeeId;
	private Project projectId;
	private Sprint sprintId;
	
	
	public WorkLog() {
		
	}


	public WorkLog(int worklogId, String monthYear, double hoursWorked, Employe employeeId, Project projectId,
			Sprint sprintId) {
		this.worklogId = worklogId;
		this.monthYear = monthYear;
		this.hoursWorked = hoursWorked;
		this.employeeId = employeeId;
		this.projectId = projectId;
		this.sprintId = sprintId;
	}


	public int getWorklogId() {
		return worklogId;
	}


	public void setWorklogId(int worklogId) {
		this.worklogId = worklogId;
	}


	public String getMonthYear() {
		return monthYear;
	}


	public void setMonthYear(String monthYear) {
		this.monthYear = monthYear;
	}


	public double getHoursWorked() {
		return hoursWorked;
	}


	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}


	public Employe getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(Employe employeeId) {
		this.employeeId = employeeId;
	}


	public Project getProjectId() {
		return projectId;
	}


	public void setProjectId(Project projectId) {
		this.projectId = projectId;
	}


	public Sprint getSprintId() {
		return sprintId;
	}


	public void setSprintId(Sprint sprintId) {
		this.sprintId = sprintId;
	}


	@Override
	public String toString() {
		return "WorkLog [worklogId=" + worklogId + ", monthYear=" + monthYear + ", hoursWorked=" + hoursWorked
				+ ", employeeId=" + employeeId + ", projectId=" + projectId + ", sprintId=" + sprintId + "]";
	}
	

}

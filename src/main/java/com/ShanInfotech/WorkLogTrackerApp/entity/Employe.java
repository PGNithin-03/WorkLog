package com.ShanInfotech.WorkLogTrackerApp.entity;

public class Employe {
	private int employeeId;
	private String name;
	private Department departmentId;
	
	
	public Employe() {
		
	}


	public Employe(int employeeId, String name, Department departmentId) {
		this.employeeId = employeeId;
		this.name = name;
		this.departmentId = departmentId;
	}


	public int getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Department getDepartmentId() {
		return departmentId;
	}


	public void setDepartmentId(Department departmentId) {
		this.departmentId = departmentId;
	}


	@Override
	public String toString() {
		return "Employe [employeeId=" + employeeId + ", name=" + name + ", departmentId=" + departmentId + "]";
	}
	
	
	
}


	
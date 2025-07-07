package com.ShanInfotech.WorkLogTrackerApp.Interfaces;

import java.sql.SQLException;

import com.ShanInfotech.WorkLogTrackerApp.entity.Project;

public interface IProject {
	void addProject(Project P)throws SQLException;

}

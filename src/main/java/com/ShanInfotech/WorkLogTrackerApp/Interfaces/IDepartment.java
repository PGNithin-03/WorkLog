package com.ShanInfotech.WorkLogTrackerApp.Interfaces;

import java.sql.SQLException;

import com.ShanInfotech.WorkLogTrackerApp.entity.Department;

public interface IDepartment {
	void addDepartment(Department D)throws SQLException;

}

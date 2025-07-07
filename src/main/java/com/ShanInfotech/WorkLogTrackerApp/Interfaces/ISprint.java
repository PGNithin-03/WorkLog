package com.ShanInfotech.WorkLogTrackerApp.Interfaces;

import java.sql.SQLException;

import com.ShanInfotech.WorkLogTrackerApp.entity.Sprint;

public interface ISprint {
	void addSprint(Sprint S)throws SQLException;

}

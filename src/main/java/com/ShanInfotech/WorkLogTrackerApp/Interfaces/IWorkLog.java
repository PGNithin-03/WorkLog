package com.ShanInfotech.WorkLogTrackerApp.Interfaces;

import java.sql.SQLException;

import com.ShanInfotech.WorkLogTrackerApp.entity.WorkLog;

public interface IWorkLog {
	void addWorkLog(WorkLog W)throws SQLException;

}

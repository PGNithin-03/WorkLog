package com.ShanInfotech.WorkLogTrackerApp.Interfaces;

import java.sql.SQLException;

import com.ShanInfotech.WorkLogTrackerApp.entity.Employe;

public interface IEmploye {
	void addEmploye(Employe e)throws SQLException;

}

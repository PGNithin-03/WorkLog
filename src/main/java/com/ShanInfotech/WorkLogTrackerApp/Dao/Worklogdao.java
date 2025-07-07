package com.ShanInfotech.WorkLogTrackerApp.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ShanInfotech.WorkLogTrackerApp.DBConnect;
import com.ShanInfotech.WorkLogTrackerApp.Interfaces.IWorkLog;
import com.ShanInfotech.WorkLogTrackerApp.entity.WorkLog;
import com.mysql.cj.protocol.Resultset;

public class Worklogdao implements IWorkLog{
	private Connection con=null;
	private PreparedStatement ps=null;
	private Resultset rs=null;
	

	@Override
	public void addWorkLog(WorkLog W) throws SQLException {
		con=DBConnect.dbConnect();
		con.setAutoCommit(false);
		
		
		String insert="insert into WorkLog value(?,?,?,?,?)";
		System.out.println("Insert the Worklog data");
		ps=con.prepareStatement(insert);
		ps.setInt(1, W.getWorklogId());
		ps.setString(2, W.getMonthYear());
		ps.setDouble(3, W.getHoursWorked());
		ps.setInt(4, W.getEmployeeId().getEmployeeId());
		ps.setInt(5, W.getProjectId().getProjectId());
		ps.setInt(6, W.getSprintId().getSprintId());
		ps.executeUpdate();
		con.commit();
		System.out.println("worklog Inserted");
		// TODO Auto-generated method stub
		
	}

}

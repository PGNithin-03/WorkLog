package com.ShanInfotech.WorkLogTrackerApp.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ShanInfotech.WorkLogTrackerApp.DBConnect;
import com.ShanInfotech.WorkLogTrackerApp.Interfaces.ISprint;
import com.ShanInfotech.WorkLogTrackerApp.entity.Sprint;
import com.mysql.cj.protocol.Resultset;

public class Sprintdao implements ISprint{
	private Connection con=null;
	private PreparedStatement ps=null;
	private Resultset rs=null;

	@Override
	public void addSprint(Sprint S) throws SQLException {
		con=DBConnect.dbConnect();
		con.setAutoCommit(false);
		
		
		String insert="insert into Sprint value(?,?,?,?,?)";
		System.out.println("Insert the SPrint Data");
		ps=con.prepareStatement(insert);
		ps.setInt(1, S.getSprintId());
		ps.setString(2, S.getSprintName());
		ps.setString(3, S.getEndDate());
		ps.setInt(5, S.getProjectId().getProjectId());
		ps.executeUpdate();
		con.commit();
		System.out.println("Sprint Data is Inserted");
		
		// TODO Auto-generated method stub
		
	}

}

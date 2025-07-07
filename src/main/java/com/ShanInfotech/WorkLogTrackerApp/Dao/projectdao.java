package com.ShanInfotech.WorkLogTrackerApp.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ShanInfotech.WorkLogTrackerApp.DBConnect;
import com.ShanInfotech.WorkLogTrackerApp.Interfaces.IProject;
import com.ShanInfotech.WorkLogTrackerApp.entity.Project;
import com.mysql.cj.protocol.Resultset;

public class projectdao implements IProject{
	private Connection con=null;
	private PreparedStatement ps=null;
	private Resultset rs=null;

	@Override
	public void addProject(Project P) throws SQLException {
		con=DBConnect.dbConnect();
		con.setAutoCommit(false);
		
		
		
		String insert="insert into Project value(?,?,?)";
		System.out.println("Insert the project Data");
		ps=con.prepareStatement(insert);
		ps.setInt(1, P.getProjectId());
		ps.setString(2, P.getProjectName());
		ps.setString(3, P.getStartDate());
		ps.executeUpdate();
		con.commit();
		System.out.println("project Data is Inserted");
		// TODO Auto-generated method stub
		
	}

}

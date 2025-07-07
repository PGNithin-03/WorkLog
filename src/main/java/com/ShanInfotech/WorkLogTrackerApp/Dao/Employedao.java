package com.ShanInfotech.WorkLogTrackerApp.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ShanInfotech.WorkLogTrackerApp.DBConnect;
import com.ShanInfotech.WorkLogTrackerApp.Interfaces.IEmploye;
import com.ShanInfotech.WorkLogTrackerApp.entity.Employe;
import com.mysql.cj.protocol.Resultset;

public class Employedao implements IEmploye{
	private Connection con=null;
	private PreparedStatement ps=null;
	private Resultset rs=null;
	

	@Override
	public void addEmploye(Employe e) throws SQLException {
		con=DBConnect.dbConnect();
		con.setAutoCommit(false);
		
		
		String insert="insert into Employee value(?,?,?)";
		System.out.println("insert the Empoyee Data");
		ps=con.prepareStatement(insert);
		ps.setInt(1, e.getEmployeeId());
		ps.setString(2, e.getName());
		ps.setInt(3, e.getDepartmentId().getDepartmentId());
		ps.executeUpdate();
		con.commit();
		System.out.println("Empaloyee data instered");
		// TODO Auto-generated method stub
		
	}

}

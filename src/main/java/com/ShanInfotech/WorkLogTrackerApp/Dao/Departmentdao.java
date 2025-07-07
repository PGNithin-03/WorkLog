package com.ShanInfotech.WorkLogTrackerApp.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ShanInfotech.WorkLogTrackerApp.DBConnect;
import com.ShanInfotech.WorkLogTrackerApp.Interfaces.IDepartment;
import com.ShanInfotech.WorkLogTrackerApp.entity.Department;
import com.mysql.cj.protocol.Resultset;


public class Departmentdao implements IDepartment{
	private Connection con=null;
	private PreparedStatement ps=null;
	private Resultset rs=null;

	@Override
	public void addDepartment(Department D) throws SQLException {
		con=DBConnect.dbConnect();
		con.setAutoCommit(false);
		
		
		String insert="insert into department value(?,?)";
		ps=con.prepareStatement(insert);
		System.out.println("department data Insert");
		ps.setInt(1, D.getDepartmentId());
		ps.setString(2, D.getDepartmentName());
		ps.executeUpdate();
		con.commit();
		System.out.println("Department Details Insterted");
		
		
		// TODO Auto-generated method stub
		
	}

}

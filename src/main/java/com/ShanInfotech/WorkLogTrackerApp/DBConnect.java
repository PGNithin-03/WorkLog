package com.ShanInfotech.WorkLogTrackerApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	static Connection con=null;//connection interface used for connection to data
	 public static Connection dbConnect() throws SQLException{
	//Class.forName("com.mysql.cj.jdbc.Driver");//we are using type 4 driver and loading driver
	//connection interface used for connection to database
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcEx","root","root");
	return con;
	
	 }

}

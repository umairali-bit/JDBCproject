package com.main.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
	
	/*
	 * Steps for connecting to db (MySql)
	 * download the driver and add it to Referenced libraries (built path)
	 * load the driver
	 * 
	 * establish the connection
	 * 
	 */
	
	
	/*
	 * Demonstrate all CURD operation using JDBS API
	 * Display follwoing menu in console for testing the operations.
	 * 
	 * 1. Insert Employee
	 * 2. Show all EMployees
	 * 3. Delete Employee
	 * 4. Update Employee
	 */
	
	Connection con;
	
	public void dbConnect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded......");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Order_mavericks","root", "6102075b");
			System.out.println("COnnection Established...");
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

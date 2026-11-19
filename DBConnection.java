package com.sms.util;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
public class DBConnection {
	public static Connection getConnection(){
		
		Connection con = null;
		
		try {
			String url ="jdbc:mysql://localhost:3306/databasename";
			String username ="root";
			String Password ="password";
			
			con=DriverManager.getConnection(url,username,Password);
			System.out.print("Database Connected Successfully!!");
			} catch (SQLException e) {
			e.printStackTrace();
			}
		return con;
	}
}

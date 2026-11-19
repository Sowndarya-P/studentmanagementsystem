package com.sms.main; 
import com.sms.controller.StudentController;
import com.sms.util.DBConnection;

import java.sql.Connection;
import java.sql.SQLException;

public class StudentMain {
	public static void main(String[] args) {
		 try {
	            Connection con = DBConnection.getConnection();
	            if (con != null)
	                con.close();
	            StudentController controller = new StudentController();
	            controller.StartApp();
	            } catch (SQLException e) {
	            	System.out.print("Database Conneection failed");
		            e.printStackTrace();
	            }
	        
		}
}

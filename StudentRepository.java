package com.sms.repository;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import com.sms.model.*;
import com.sms.util.DBConnection;
public class StudentRepository {
	
	
	public boolean addStudent(Student student) {
		
		
		String sql = "INSERT INTO student VALUES(?, ?, ?, ?, ?)";
		try(Connection con = DBConnection.getConnection();
			PreparedStatement ps = con.prepareStatement(sql)){
			ps.setInt(1,student.getId());
			ps.setString(2,student.getName());
			ps.setString(3,student.getDepartment());
			ps.setString(4,student.getEmail());
			ps.setLong(4,student.getPhoneno());
			
			ps.executeUpdate();
			System.out.print("Student Added Successfully");
			
		}
		catch (SQLException e) {
			e.printStackTrace();
			}
		return false;
		
	}
	


	
}


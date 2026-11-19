package com.sms.model;

public class Student {
	private int StudentId;
	private String StudentName;
	private String Department;
	private String Email;
	private long Phoneno;
	
	public Student(int StudentId,String StudentName,String Department,String Email,long Phoneno){
		this.StudentId=StudentId;
		this.StudentName=StudentName;
		this.Department=Department;
		this.Email=Email;
		this.Phoneno=Phoneno;
	}
	
	public int getId() {
		return StudentId;
	}
	
	public void setId(int StudentId) {
		this.StudentId=StudentId;
	}
	
	
	public String getName() {
		return StudentName;
	}
	
	public void setId(String StudentName) {
		this.StudentName=StudentName;
	}
	
	public String getDepartment() {
		return Department;
	}
	
	public void setDepartment(String Department) {
		this.Department=Department;
	}
	
	public String getEmail() {
		return Email;
	}
	
	public void setEmail(String Email) {
		this.Email=Email;
	}
	
	public long getPhoneno() {
		return Phoneno;
	}
	
	public void setPhoneno(long Phoneno) {
		this.Phoneno=Phoneno;
	}
	
	public String toString() {
		return StudentId+" "+StudentName+" "+Department+" "+Email+" "+Phoneno;
	}
	
	public static void main(String[] args) {
		
		

	}

}

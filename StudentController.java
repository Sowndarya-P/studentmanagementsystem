package com.sms.controller;

import java.util.List;
import java.util.Scanner;
import com.sms.model.Student;
import com.sms.service.*;

public class StudentController {
	StudentService service = new StudentService();
	Scanner ref = new Scanner(System.in);
	
	public void StartApp() {
		System.out.print("STUDENT MANAGEMENT SYSTEM");
		
		System.out.print("1.Add Student");
		System.out.print("2.View Student");
		System.out.print("3.Search Student");
		System.out.print("4.Exit");
		System.out.print("Enter your choice:");
		
		int choice = ref.nextInt();
		
		switch(choice) {
        case 1:
        	AddStudent();
            break;
        case 2:
        	ViewStudent();
            break;
        case 3:
            SearchStudent();
            break;
        case 4:
        	System.out.print("Thankyou");
            break;
        default:
        	System.out.print("Invalid Choice");
		}	
	}
	
	public void AddStudent() {
		System.out.print("Enter StudentId:");
		int Id=ref.nextInt();
		ref.nextLine();
		System.out.print("Enter StudentName:");
		String Name=ref.nextLine();
		System.out.print("Enter Department:");
		String Department=ref.nextLine();
		System.out.print("Enter Email:");
		String Email=ref.nextLine();
		System.out.print("Enter Phoneno:");
		long Number=ref.nextLong();
		
		Student student = new Student(Id,Name,Department,Email,Number);
		
		boolean result = service.addStudent(student);
		if(result) {
			System.out.println("Student Added Successfully!!");
		}
		}
	
public void ViewStudent() {
		
		List<Student> student= service.findAll();
			if(student.isEmpty()) {
				System.out.println("No data");
			}
			else {
				for (Student students : student) {
				System.out.println(students);
			}
		}
	}
		
	public void SearchStudent() {
		System.out.println("Enter Id?");
		int id=ref.nextInt();
		Student student = service.findById(id);
		if(student !=  null) {
			System.out.println(student);
		}
		else {
			System.out.println("No Id Found");
			
	}
	}
}



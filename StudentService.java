package com.sms.service;

import java.util.List;

import com.sms.model.Student;
import com.sms.repository.*;
public class StudentService {
	StudentRepository repo = new StudentRepository();
	public boolean addStudent(Student student) {
		return repo.add(student);
	}
	public List<Student> findAll(){
		return repo.findAll();
	}
	public Student findById(int id) {
		return repo.findById(id);
	}
}

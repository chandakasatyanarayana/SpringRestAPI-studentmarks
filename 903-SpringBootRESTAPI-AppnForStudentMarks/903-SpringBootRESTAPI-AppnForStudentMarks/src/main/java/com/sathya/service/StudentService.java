package com.sathya.service;

import java.util.List;

import com.sathya.model.Student;

public interface StudentService {
	public Student saveStudent(Student student);
	public Student updateStudent(Student student,int sid);
	public Student getOneStudent(int sid);
	public void deleteStudent(int sid);
	public List<Student> getAllStudent();
}

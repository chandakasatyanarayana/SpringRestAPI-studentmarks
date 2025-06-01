package com.sathya.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.model.Student;
import com.sathya.service.StudentServiceImp;

@RestController
@CrossOrigin(origins = { "*" })
public class StudentController {
	@Autowired StudentServiceImp studentServiceImp;
	@PostMapping("/save")
	public String saveStudentDetails(@RequestBody Student student)
	{
		Student saveData=studentServiceImp.saveStudent(student);
		String message=null;
		if(saveData!=null)
		{
			message="Data has been successfully saved";
		}
		else
		{
			message="Data is failed";
		}
		return message;	
	}
	@GetMapping("/getOne/{sid}")
	public Student getStudent(@PathVariable int sid)
	{
		Student get=studentServiceImp.getOneStudent(sid);
		
		return get;	
	}
	@GetMapping("/getAll")
	public List<Student> getAllStudentsDetails()
	{
		List<Student> all=studentServiceImp.getAllStudent();
		return all;
	}
	
	
	
	@DeleteMapping("/delete/{sid}")
	public void delete(@PathVariable int sid)
	{
		studentServiceImp.deleteStudent(sid);
	}
	@PutMapping("/update/{sid}")
	public Student update(@RequestBody Student student,@PathVariable int sid)
	{
		Student updatedRecord=studentServiceImp.updateStudent(student, sid);
		return updatedRecord;
	}
}

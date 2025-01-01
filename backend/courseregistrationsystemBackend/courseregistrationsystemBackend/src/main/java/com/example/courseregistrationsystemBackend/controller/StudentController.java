package com.example.courseregistrationsystemBackend.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.courseregistrationsystemBackend.model.Student;
import com.example.courseregistrationsystemBackend.service.StudentService;

@RestController
@CrossOrigin(origins="http://127.0.0.1:5500")
public class StudentController {

	@Autowired
	private StudentService ss;
	
	
	@PostMapping("add/students")
	public String addStudents(@RequestParam("name") String name,
			@RequestParam("emailId") String emailId,
			@RequestParam("contactNumber") String contactNumber,
			@RequestParam("courseName") String courseName) {
		ss.addStudents(name,emailId,contactNumber,courseName);
				return "Sucess";
		
	}
	
	@GetMapping("studentsDetails")
	public List<Student> studentsDetails(){
		return ss.getStudentsDetails();
	}
	
	@PutMapping("clear/studentsDetails")
	public void clearStudentsDetails() {
		ss.clearStudentsDetails();
	}
}

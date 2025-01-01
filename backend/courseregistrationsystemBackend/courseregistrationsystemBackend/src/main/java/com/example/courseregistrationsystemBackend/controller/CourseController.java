package com.example.courseregistrationsystemBackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.courseregistrationsystemBackend.model.CourseRegistry;
import com.example.courseregistrationsystemBackend.model.Courses;
import com.example.courseregistrationsystemBackend.service.CourseService;

@RestController
@CrossOrigin(origins="http://127.0.0.1:5500")
public class CourseController {
	
	@Autowired
	private CourseService cs;
	
	@GetMapping("courses")
	public List<Courses> getCourses(){
		return cs.getCourses();
	}
	
	@GetMapping("enrolledStudents")
	public List<CourseRegistry> erolledStudents(){
		return cs.getEnrolledStudents();
	}

}

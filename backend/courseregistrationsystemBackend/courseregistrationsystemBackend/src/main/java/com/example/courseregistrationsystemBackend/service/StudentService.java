package com.example.courseregistrationsystemBackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.courseregistrationsystemBackend.model.CourseRegistry;
import com.example.courseregistrationsystemBackend.model.Student;
import com.example.courseregistrationsystemBackend.repository.CourseRegistryRepo;
import com.example.courseregistrationsystemBackend.repository.StudentRepo;

@Service
public class StudentService {

	@Autowired
	private StudentRepo repo;
	
	@Autowired
	private CourseRegistryRepo crr;
	
	public void addStudents(String name, String emailId, String contactNumber, String courseName) {
		Student s=new Student(name,emailId,contactNumber,courseName);
		repo.save(s);
		CourseRegistry cr=new CourseRegistry(name,emailId,courseName);
		crr.save(cr);
		
	}
	public List<Student> getStudentsDetails() {
		return repo.findAll();
	}
	public void clearStudentsDetails() {
		repo.deleteAll();
	}
	
	
	
}

package com.example.courseregistrationsystemBackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.courseregistrationsystemBackend.model.CourseRegistry;
import com.example.courseregistrationsystemBackend.model.Courses;
import com.example.courseregistrationsystemBackend.repository.CourseRegistryRepo;
import com.example.courseregistrationsystemBackend.repository.CourseRepo;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepo cr;
	
	@Autowired
	private CourseRegistryRepo crr;

	public List<Courses> getCourses() {
		return cr.findAll();
	}


	public List<CourseRegistry> getEnrolledStudents() {
		return crr.findAll();
	}

}

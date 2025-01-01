package com.example.courseregistrationsystemBackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Courses {
	
	
	@Id
	private String CourseId;
	
	private String CourseName;
	private String TrainerName;
	private String Duration;
	public Courses(String courseId, String courseName, String trainerName, String duration) {
		CourseId = courseId;
		CourseName = courseName;
		TrainerName = trainerName;
		Duration = duration;
	}
	public Courses() {
		
	}
	public String getCourseId() {
		return CourseId;
	}
	public void setCourseId(String courseId) {
		CourseId = courseId;
	}
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	public String getTrainerName() {
		return TrainerName;
	}
	public void setTrainerName(String trainerName) {
		TrainerName = trainerName;
	}
	public String getDuration() {
		return Duration;
	}
	public void setDuration(String duration) {
		Duration = duration;
	}
	
}

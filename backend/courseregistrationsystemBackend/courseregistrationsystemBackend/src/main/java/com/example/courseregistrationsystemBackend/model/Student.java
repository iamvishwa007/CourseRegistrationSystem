package com.example.courseregistrationsystemBackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

	@Id
	private String name;
	private String emailId;
	
	private String contactNumber;
	private String courseName;
	public Student(String name, String emailId, String contactNumber, String course) {
		this.name = name;
		this.emailId = emailId;
		this.contactNumber = contactNumber;
		this.courseName = course;
	}
	public Student() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getContact_Number() {
		return contactNumber;
	}
	public void setContact_Number(String contact_Number) {
		this.contactNumber = contact_Number;
	}
	public String getCourse() {
		return courseName;
	}
	public void setCourse(String course) {
		this.courseName = course;
	}
	
}

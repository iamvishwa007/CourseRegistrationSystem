package com.example.courseregistrationsystemBackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.courseregistrationsystemBackend.model.Courses;

@Repository
public interface CourseRepo extends JpaRepository<Courses,String> {

}

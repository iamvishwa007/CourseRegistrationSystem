package com.example.courseregistrationsystemBackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.courseregistrationsystemBackend.model.Student;
@Repository
public interface StudentRepo extends JpaRepository<Student,String> {

}

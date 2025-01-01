
package com.example.courseregistrationsystemBackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.courseregistrationsystemBackend.model.CourseRegistry;

public interface CourseRegistryRepo extends JpaRepository<CourseRegistry,Integer> {

}

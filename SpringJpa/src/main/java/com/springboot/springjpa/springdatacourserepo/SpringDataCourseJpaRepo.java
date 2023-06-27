package com.springboot.springjpa.springdatacourserepo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.springjpa.coursedetail.Course;

public interface SpringDataCourseJpaRepo extends JpaRepository<Course, Long> {

	List<Course> findByAuthor(String author);

	List<Course> findByName(String name);
}

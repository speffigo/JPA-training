package com.springboot.springjpa.courserepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springboot.springjpa.coursedetail.Course;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJpaRepo {

	@Autowired
	private EntityManager entityManager;

	public void insert(Course course) {
		entityManager.merge(course);
	}

	public Course findById(long id) {
		return entityManager.find(Course.class, id);
	}

	public void delete(long id) {
		Course course = entityManager.find(Course.class, id);
		entityManager.remove(course);
	}

}

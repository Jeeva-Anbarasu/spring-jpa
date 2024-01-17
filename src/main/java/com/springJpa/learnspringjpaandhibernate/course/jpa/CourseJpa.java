package com.springJpa.learnspringjpaandhibernate.course.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springJpa.learnspringjpaandhibernate.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional // whenever you want to query with JPA use @Transactional annotation
public class CourseJpa {
	
	@Autowired
	private EntityManager entityManager;
	
	public void insert(Course course) {
		entityManager.merge(course);
	}
	
	public Course findById(Long id) {
		return entityManager.find(Course.class, id);
	}
	
	public void deleteById(Long id) {
		Course course = entityManager.find(Course.class,id);
		entityManager.remove(course);
	}
}

package com.springJpa.learnspringjpaandhibernate.course.springdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springJpa.learnspringjpaandhibernate.course.Course;

@Repository
public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long>{
	
	List<Course> findByAuthor(String name);
	
	List<Course> findByName(String name);

}

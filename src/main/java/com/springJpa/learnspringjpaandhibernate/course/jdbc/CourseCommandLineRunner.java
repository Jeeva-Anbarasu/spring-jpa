package com.springJpa.learnspringjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springJpa.learnspringjpaandhibernate.course.Course;
import com.springJpa.learnspringjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{

//	@Autowired 
//	CourseJdbcRepository course;
//	@Autowired
//	private CourseJpa course;
	
	@Autowired
	private CourseSpringDataJpaRepository course;
	
	@Override
	public void run(String... args) throws Exception {
		course.save(new Course(1L , "Learn spring JPA" , "Jeeva"));
		course.save(new Course(2L,"Learn Azure" , "Jithesh"));
		course.save(new Course(3L , "Learn Devops" , "Hari"));
		course.deleteById(2L);
		
		System.out.println(course.findById(1L));
		System.out.println(course.findAll());
		System.out.println(course.count());
		System.out.println(course.findByAuthor("Hari"));
		System.out.println("----------------Finding by course name------------------");
		System.out.println(course.findByName("Learn Devops"));
		System.out.println(course.findByName("Learn spring JPA"));
	}

}

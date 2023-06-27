package com.springboot.springjpa.courserepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springboot.springjpa.coursedetail.Course;
import com.springboot.springjpa.springdatacourserepo.SpringDataCourseJpaRepo;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

	//@Autowired
	//private CourseJpaRepo repository;

	@Autowired
	private SpringDataCourseJpaRepo repository;

	/*@Override
	public void run(String... args) throws Exception {
		repository.insert(new Course(1, "java", "saurabh"));
		repository.insert(new Course(2, "SQ", "pathak"));
		repository.insert(new Course(3, "AIML", "saur"));
		repository.delete(1);
		System.out.println(repository.findById(2));*/
	@Override
	public void run(String... args) throws Exception {

		repository.save(new Course(1, "Spring", "me"));
		repository.save(new Course(2, "Spring", "me"));
		repository.save(new Course(3, "Spring", "me"));

		repository.deleteById(2l);
		System.out.println(repository.findById(3l));
		System.out.println(repository.findByAuthor("me"));
		System.out.println(repository.findByName("Spring"));
	}

}

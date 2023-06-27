package com.springboot.springjdbc.courserepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springboot.springjdbc.coursedetail.Course;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

	@Autowired
	private CourseJdbcRepo repositor;

	@Override
	public void run(String... args) throws Exception {
		repositor.insert(new Course(1, "java", "saurabh"));
		repositor.insert(new Course(2, "SQL", "pathak"));
		repositor.insert(new Course(3, "AIML", "saur"));
		repositor.delete(1);
		System.out.println(repositor.findById(2));

	}

}

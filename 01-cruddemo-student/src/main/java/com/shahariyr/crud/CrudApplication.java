package com.shahariyr.crud;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.shahariyr.crud.dao.StudentDao;
import com.shahariyr.crud.entity.Student;

@SpringBootApplication
public class CrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}
	

	@Bean
	CommandLineRunner commandLineRunner(StudentDao studentDao) {
		return CommandLineRunner -> {
			createStudent(studentDao);
		};
	}
	

	private void createStudent(StudentDao studentDao) {

		// Create student
		System.out.println("Creating new student......");
		Student tempStudent1 = new Student("Shahariyr", "Reza", "Shahariyr@hotmail.com");
		Student tempStudent2 = new Student("Mazher", "Reza", "Mazher@hotmail.com");
		Student tempStudent3 = new Student("Akash", "Rahman", "Akash.rahman@hotmail.com");
		

		// Save student
		System.out.println("Saveing the student.....");
		studentDao.save(tempStudent1);
		studentDao.save(tempStudent2);
		studentDao.save(tempStudent3);

		// display student
		System.out.println("id" + " " + tempStudent1.getId());
		System.out.println("First name" + " " + tempStudent1.getFirstName());
		System.out.println("Last name" + " " + tempStudent1.getLastName());
		System.out.println("Email" + " " + tempStudent1.getEmail());
		
		System.out.println("id" + " " + tempStudent2.getId());
		System.out.println("First name" + " " + tempStudent2.getFirstName());
		System.out.println("Last name" + " " + tempStudent2.getLastName());
		System.out.println("Email" + " " + tempStudent2.getEmail());
		
		System.out.println("id" + " " + tempStudent3.getId());
		System.out.println("First name" + " " + tempStudent3.getFirstName());
		System.out.println("Last name" + " " + tempStudent3.getLastName());
		System.out.println("Email" + " " + tempStudent3.getEmail());
	}
}






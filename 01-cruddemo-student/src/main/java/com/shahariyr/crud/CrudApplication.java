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
		Student tempStudent = new Student("Mitu", "Rahman", "Mitu.rahman@hotmail.com");

		// Save student
		System.out.println("Saveing the student.....");
		studentDao.save(tempStudent);

		// display student
		System.out.println("id" +" "+ tempStudent.getId());
		System.out.println("First name"+" " + tempStudent.getFirstName());
		System.out.println("Last name"+" " + tempStudent.getLastName());
		System.out.println("Email"+" " + tempStudent.getEmail());
	}
}

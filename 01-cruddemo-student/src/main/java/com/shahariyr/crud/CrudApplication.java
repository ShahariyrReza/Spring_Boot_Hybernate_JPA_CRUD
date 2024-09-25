package com.shahariyr.crud;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.shahariyr.crud.dao.StudentDAO;
import com.shahariyr.crud.entity.Student;

@SpringBootApplication
public class CrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}

	
	// @Bean // No need to add the "@Bean" annotation here, because the public
	// method allow the component scan already.
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return CommandLineRunner -> {
			createStudent(studentDAO);
		};

	}

	private void createStudent(StudentDAO studentDAO) {

		System.out.println("Creating the student object");
		
		Student tempStudent = new Student("Shahariyr", "reza", "shahariyr.reza@hotmail.com");

		System.out.println("Saving the student object");
		studentDAO.save(tempStudent);
		
		System.out.println("ID :"+tempStudent.getId());
		
	}

}

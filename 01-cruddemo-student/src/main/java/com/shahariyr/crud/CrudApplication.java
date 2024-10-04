package com.shahariyr.crud;

import java.util.List;

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
			// createStudent(studentDao);

			// findStudent(studentDao);

			//findAllStudent(studentDao);
			
			updateStudent(studentDao);
		};
	}

	private void updateStudent(StudentDao studentDao) {
		//read the student based on ID
		System.out.println("Set the student id :");
		int studentId = 3;
		Student myStudent = studentDao.findById(studentId);
		
		//change first name
		myStudent.setEmail("anik.ahamed@hotmail.com");;
		
		//update student
		studentDao.update(myStudent);
		
		//display student
		System.out.println(myStudent);
		
	}

	private void findAllStudent(StudentDao studentDao) {

		// get a list of student
		List<Student> theStudents = studentDao.findall();

		// display the list of student.

		for (Student temStudent : theStudents) {
			System.out.println(temStudent);
		}

	}

	private void findStudent(StudentDao studentDao) {
		// create a student;
		System.out.println("Creating new student......");
		Student temStudent = new Student("Rakib", "Ahammed", "shibber.munna@gmail.com");

		// save the student;
		System.out.println("Saving New student done");
		studentDao.save(temStudent);

		// display the id of the student;
		int theId = temStudent.getId();
		System.out.println("Id of the student is :" + theId);

		// read the student based on id;
		System.out.println("the student ID is :" + theId);

		// display student;
		Student myStudent = studentDao.findById(theId);
		System.out.println(myStudent);

	}

	private void createStudent(StudentDao studentDao) {

		// Create student
		System.out.println("Creating new student......");
		Student tempStudent1 = new Student("Shahariyr", "Reza", "Shahariyr@hotmail.com");
		Student tempStudent2 = new Student("Mazher", "Reza", "Mazher@hotmail.com");
		Student tempStudent3 = new Student("Akash", "Rahman", "Akash.rahman@hotmail.com");

		// Save student
		System.out.println("Saving the student.....");
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

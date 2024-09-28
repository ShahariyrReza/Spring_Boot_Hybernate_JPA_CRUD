package com.shahariyr.crud.dao;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.shahariyr.crud.entity.Student;

import jakarta.persistence.EntityManager;

@Repository
public class StudentDaoImp implements StudentDao {

	// field define
	private EntityManager entityManager;

	// constructor define using field
	// @Autowired ; optional
	public StudentDaoImp(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public void save(Student theStudent) {
		entityManager.persist(theStudent);

	}

}

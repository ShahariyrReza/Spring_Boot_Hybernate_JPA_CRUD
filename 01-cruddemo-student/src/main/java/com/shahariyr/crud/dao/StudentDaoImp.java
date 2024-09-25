package com.shahariyr.crud.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.shahariyr.crud.entity.Student;

import jakarta.persistence.EntityManager;

@Repository
public class StudentDaoImp implements StudentDAO {

	@Autowired
	private EntityManager entityManager;

	public StudentDaoImp(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Transactional
	@Override
	public void save(Student theStudent) {
		entityManager.persist(theStudent);

	}

}

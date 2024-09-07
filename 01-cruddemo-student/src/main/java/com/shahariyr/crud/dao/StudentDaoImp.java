package com.shahariyr.crud.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import jakarta.persistence.EntityManager;

@Repository
public class StudentDaoImp implements StudentDAO {

	
	
	@Autowired
	private EntityManager entityManager;
	
	public StudentDaoImp(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	/*
	public StudentDaoImp(EntityManager thEntityManager) {
		entityManager = thEntityManager;
	}
	*/
	

	@Transactional
	@Override
	public void save() {
		// TODO Auto-generated method stub
		
	}

	
	
	
}

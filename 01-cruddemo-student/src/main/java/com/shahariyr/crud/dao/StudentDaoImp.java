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
	// @Autowired
	public StudentDaoImp(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	//Override the method..
	@Override
	@Transactional
	public void save(Student theStudent) {
		entityManager.persist(theStudent);

	}

	@Override
	public Student findById(Integer id) {
		// TODO Auto-generated method stub
		return entityManager.find(Student.class, id);
	}


}

package com.shahariyr.crud.dao;
import java.util.List;

import com.shahariyr.crud.entity.*;

public interface StudentDao {

	void save(Student theStudent);
	
	Student findById(Integer id);
	
	List<Student> findall();
	
	void update(Student theStudent);
	
	

}

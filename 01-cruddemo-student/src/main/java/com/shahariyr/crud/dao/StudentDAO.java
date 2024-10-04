package com.shahariyr.crud.dao;
import com.shahariyr.crud.entity.*;

public interface StudentDao {

	void save(Student theStudent);
	
	Student findById(Integer id);

}

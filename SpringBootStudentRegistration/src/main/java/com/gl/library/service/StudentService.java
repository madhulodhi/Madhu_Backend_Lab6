 package com.gl.library.service;

import java.util.List;

import com.gl.library.entity.Students;

public interface StudentService {

	List<Students> findAll();
	Students findById(int id);
	void save(Students book);
	void deleteById(int id);
	List<Students> searchBy(String name, String auther);
}

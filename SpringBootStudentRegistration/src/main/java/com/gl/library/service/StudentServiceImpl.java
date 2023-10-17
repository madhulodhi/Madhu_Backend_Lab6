package com.gl.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.library.entity.Students;
import com.gl.library.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository bookRepository;
	@Override
	public List<Students> findAll() {
		return bookRepository.findAll();
	}

	@Override
	public Students findById(int id) {
		return bookRepository.findById(id).get();
	}

	@Override
	public void save(Students book) {
		bookRepository.save(book);
	}

	@Override
	public void deleteById(int id) {
		bookRepository.deleteById(id);
	}

	@Override
	public List<Students> searchBy(String name, String auther) {
		return bookRepository.findByNameContainsAndAuthorContainsAllIgnoreCase(name,auther);
	}

}
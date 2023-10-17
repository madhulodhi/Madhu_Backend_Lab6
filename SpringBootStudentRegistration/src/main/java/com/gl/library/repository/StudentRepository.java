package com.gl.library.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.library.entity.Students;

public interface StudentRepository extends JpaRepository<Students, Integer> {

List<Students> findByNameContainsAndAuthorContainsAllIgnoreCase(String name, String author);
}


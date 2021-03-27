package com.ojas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ojas.model.Student;

public interface StudentDAO extends JpaRepository<Student, Integer>{
	
	
}

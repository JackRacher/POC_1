package com.ojas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.ojas.dao.StudentDAO;
import com.ojas.model.Student;

@Service
public class StudentService {
	
	@Autowired
	private StudentDAO dao;
	
	public Student create(Student student) {
		return dao.save(student);
	}
	
	public Iterable<Student> getAllStudents(){
		return dao.findAll();
	}
	
	public Iterable<Student> pagination(){
		return dao.findAll(PageRequest.of(0, 2));
	}

}

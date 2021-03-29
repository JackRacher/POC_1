package com.ojas.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ojas.model.Student;
import com.ojas.services.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@PostMapping("/create")
	public Student create(@RequestBody Student student) {
		return service.create(student);
	}
	
	@GetMapping("/getAllStudents")
	public Iterable<Student> getInfo(){
		return service.getAllStudents();
	}
	
	@GetMapping("/getStudents")
	public Iterable<Student> getStudent(){
		return service.pagination();
	}
	
	@GetMapping("/getStudent/{number}")
	public Iterable<Student> getStudentPagination(@PathVariable("number") Integer number){
		return service.pagiantionByNumber(number);
	}
	
	
}

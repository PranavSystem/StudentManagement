package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojo.Student;
import com.app.service.studentservice;

@RestController
@RequestMapping("/student")
public class Studentcontroller 
{

	@Autowired
	private studentservice studservice;
	
	
	@PostMapping("/addstudent1")
	public ResponseEntity<Student> addstudents(@RequestBody Student stud)
	{
		return ResponseEntity.ok(studservice.addstudent(stud));
		
	}
	
	@GetMapping("/getstudent/{id}")
	
	public ResponseEntity<Student> getstudents(@PathVariable long id)
	{
		return ResponseEntity.ok(studservice.getstudent(id));
	}
	
	@PutMapping("/updatestudent/{id}")
	public ResponseEntity<Student> updatestudents(@RequestBody Student stud,@PathVariable long id)
	{
		return ResponseEntity.ok(studservice.updateStudent(stud, id));
	}
	
	@DeleteMapping("/deltestudent/{id}")
	public ResponseEntity<String> deltestudent(@PathVariable long id)
	{
		return ResponseEntity.ok(studservice.deleteStudent(id));
	}


}

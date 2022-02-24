package com.example.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.student.model.Student;
import com.example.student.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService; 
	
	@GetMapping("/")
	public ResponseEntity<List<Student>> getStudent() {
		return ResponseEntity.ok(this.studentService.getStudent());
	}
	
	@PostMapping("/")
	public ResponseEntity<Student> addStudent(@RequestBody Student st){
		return ResponseEntity.ok(this.studentService.addStudent(st));
	}
	
	@DeleteMapping("/{id}")
	public void deleteStudent(@PathVariable("id") int id){
		this.studentService.deleteStudent(id);
	}
	
	@PutMapping("/")
	public ResponseEntity<Student> updateStudent(@RequestBody Student st) {
		return ResponseEntity.ok(this.studentService.updateStudent(st));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Student> getById(@PathVariable("id") int id){
		return ResponseEntity.ok(this.studentService.getById(id));
	}
}

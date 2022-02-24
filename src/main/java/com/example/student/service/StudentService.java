package com.example.student.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.student.model.Student;
import com.example.student.repo.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	public List<Student> getStudent() {
		return new ArrayList<>(this.studentRepository.findAll());
	}
	
	public Student addStudent(Student st) {
		System.out.println(st);
		return this.studentRepository.save(st);
	}

	public void deleteStudent(int id) {
		this.studentRepository.deleteById(id);
	}

	public Student updateStudent(Student st) {
		
		return this.studentRepository.save(st);
	}

	public Student getById(int id) {
		// TODO Auto-generated method stub
		return this.studentRepository.findById(id).get();
	}
	
}

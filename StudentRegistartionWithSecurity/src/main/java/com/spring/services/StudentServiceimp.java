package com.spring.services;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.ServiceInterface.StudentService;
import com.spring.models.Student;
import com.spring.repo.StudentRepository;


@Service
public class StudentServiceimp implements StudentService{

	@Autowired
	private StudentRepository studentRepo;
	
	@Autowired
	
	@Override
	public List<Student> getAllStudent() {
		return studentRepo.findAll();
	}

	@Override
	public void saveStudent(Student student) {
		// TODO Auto-generated method stub
		this. studentRepo.save(student);
		
	}
	

	@Override
	public Student getStudentById(long id) {
		Optional<Student> optional=studentRepo.findById(id);
		Student student= null;
		if(optional.isPresent()) {
			student = optional.get();
			
		}
		else {
			throw new RuntimeException("Student not found for id : :" + id);
		}
		return student;
	}

	@Override
	public void deleteStudentById(long id) {
		// TODO Auto-generated method stub
		this.studentRepo.deleteById(id);
		
	}

}

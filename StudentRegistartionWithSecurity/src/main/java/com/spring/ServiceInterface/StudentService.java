package com.spring.ServiceInterface;

import java.util.List;

import org.springframework.stereotype.Service;


import com.spring.models.Student;


public interface StudentService {
List<Student> getAllStudent();
void saveStudent(Student student);


Student getStudentById(long id);
void deleteStudentById(long id);
}

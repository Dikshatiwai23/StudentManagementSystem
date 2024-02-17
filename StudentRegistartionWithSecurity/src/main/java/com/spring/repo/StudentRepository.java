package com.spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.models.Student;

@Repository

/*@Repository annotation is used to indicate that the class provides 
 * the mechanism for storage, retrieval, search, update and delete operation on objects*/
 
public interface StudentRepository extends JpaRepository<Student, Long>{

}

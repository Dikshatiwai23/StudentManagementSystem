package com.spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.models.User;

public interface UserRepository extends JpaRepository<User, String>{

	public User findByUsername(String username);
}

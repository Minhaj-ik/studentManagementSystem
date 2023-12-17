package com.minhaj.studentManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minhaj.studentManagementSystem.model.User;

public interface userRepository extends JpaRepository<User, Long>{
	
	

	
}

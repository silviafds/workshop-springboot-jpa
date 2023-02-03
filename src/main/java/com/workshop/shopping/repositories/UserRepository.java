package com.workshop.shopping.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workshop.shopping.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}

package com.workshop.shopping.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workshop.shopping.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}

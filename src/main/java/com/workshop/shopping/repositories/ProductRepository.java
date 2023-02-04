package com.workshop.shopping.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workshop.shopping.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}

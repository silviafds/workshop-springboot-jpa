package com.workshop.shopping.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workshop.shopping.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}

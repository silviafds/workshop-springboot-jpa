package com.workshop.shopping.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workshop.shopping.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}

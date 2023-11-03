package com.empresa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresa.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}

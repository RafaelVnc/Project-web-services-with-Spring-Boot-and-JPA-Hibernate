package com.empresa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresa.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}

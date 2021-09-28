package com.wanderson.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wanderson.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}

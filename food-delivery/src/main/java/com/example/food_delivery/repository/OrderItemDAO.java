package com.example.food_delivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.food_delivery.model.OrderItem;

public interface OrderItemDAO extends JpaRepository<OrderItem,Integer>{

}

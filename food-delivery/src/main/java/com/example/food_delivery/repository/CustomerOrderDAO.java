package com.example.food_delivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.food_delivery.model.CustomerOrder;

public interface CustomerOrderDAO extends JpaRepository<CustomerOrder,Integer>{

}

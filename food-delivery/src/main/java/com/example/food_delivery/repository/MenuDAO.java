package com.example.food_delivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.food_delivery.model.Menu;

public interface MenuDAO extends JpaRepository<Menu, Integer>{

}

package com.example.food_delivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.food_delivery.model.Restaurant;

public interface RestaurantDAO extends JpaRepository<Restaurant, Integer>{

}

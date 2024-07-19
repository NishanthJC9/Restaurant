package com.example.food_delivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.food_delivery.model.User;

public interface UserDAO extends JpaRepository<User,Integer>{

}

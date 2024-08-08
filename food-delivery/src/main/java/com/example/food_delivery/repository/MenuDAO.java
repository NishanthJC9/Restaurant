package com.example.food_delivery.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.food_delivery.model.Menu;

public interface MenuDAO extends JpaRepository<Menu, Integer> {

    @Query("SELECT m FROM Menu m WHERE m.restaurant.restaurantId = :restaurantId")
    List<Menu> findMenuItemsByRestaurantId(@Param("restaurantId") Integer restaurantId);

}

package com.example.food_delivery.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.example.food_delivery.dto.RestaurantDTO;
import com.example.food_delivery.exception.RecordNotFoundException;
import com.example.food_delivery.model.Restaurant;
import com.example.food_delivery.service.RestaurantService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@CrossOrigin(origins = "*")
@RestController
public class RestaurantController {
	
	@Autowired
	RestaurantService rs;
	
	@PostMapping("/addRestaurant")
	public String addRestaurant(@RequestBody RestaurantDTO rdto) {
		return rs.addRestaurant(rdto);
	}
	@GetMapping("/getRestaurantById/{resId}")
    public ResponseEntity<?> getRestaurantById(@PathVariable int resId) {
        try {
            return rs.getRestaurantById(resId);
        } catch (RecordNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }
    
    @GetMapping("/getAllRestaurants")
    public List<Restaurant> getAllRestaurants(){
        return rs.getAllRestaurants();
    }
}

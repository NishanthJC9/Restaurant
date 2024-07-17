package com.example.food_delivery.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.food_delivery.dto.RestaurantDTO;
import com.example.food_delivery.exception.RecordNotFoundException;
import com.example.food_delivery.model.Restaurant;
import com.example.food_delivery.repository.RestaurantDAO;

@Service
public class RestaurantService {
	
	@Autowired
	RestaurantDAO rdao;

	public String addRestaurant(RestaurantDTO rdto) {
		Restaurant res = new Restaurant();
		res.setRestaurantId(rdto.getRestaurantId());
		res.setRestaurantAddress(rdto.getRestaurantAddress());
		res.setRestaurantEmail(rdto.getRestaurantEmail());
		res.setRestaurantName(rdto.getRestaurantName());
		res.setRestaurantPhone(rdto.getRestaurantPhone());
		rdao.save(res);
		return "Restaurant Added successfully";
	}

	public Optional<Restaurant> getRestaurantById(int resId) throws RecordNotFoundException {
		Optional<Restaurant> ores = rdao.findById(resId);
		if(!ores.isPresent()) {
			throw new RecordNotFoundException("Record Not found");
		}
		return ores;
	}
	
}

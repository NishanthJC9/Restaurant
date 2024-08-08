package com.example.food_delivery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.food_delivery.dto.MenuDTO;
import com.example.food_delivery.exception.RecordNotFoundException;
import com.example.food_delivery.model.Menu;
import com.example.food_delivery.service.MenuService;

@CrossOrigin(origins = "*")
@RestController
public class MenuController {

	@Autowired
	MenuService ms;
	
	@PostMapping("/addMenu")
	public String addMenu(@RequestBody MenuDTO dto) {
		return ms.addMenu(dto);
	}
	
	@GetMapping("/getAllMenu")
	public List<Menu> getAllMenu() {
		return ms.getAllMenu();
	}

	@GetMapping("/getRestaurantMenu/{resId}")
	public List<Menu> getRestaurantMenu(@PathVariable int resId) {
		return ms.getMenusForRestaurant(resId);
	}
	

	@GetMapping("/getMenuById/{menuId}")
	public ResponseEntity<?> getMenuById(@PathVariable int menuId) {
		try{
			return ms.getMenuById(menuId);
		}
		catch(RecordNotFoundException e){
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
		}
	}
	
	
}

package com.example.food_delivery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.food_delivery.dto.MenuDTO;
import com.example.food_delivery.model.Menu;
import com.example.food_delivery.service.MenuService;

@RestController
public class MenuController {

	@Autowired
	MenuService ms;
	
	@PostMapping("/addMenu")
	public String addMenu(@RequestBody MenuDTO dto) {
		return ms.addMenu(dto);
	}
	
	@GetMapping("/getAllMenu")
	public List<Menu> getMethodName(String param) {
		return ms.getAllMenu();
	}
	
}

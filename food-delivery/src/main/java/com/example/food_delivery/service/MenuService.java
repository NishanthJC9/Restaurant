package com.example.food_delivery.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.food_delivery.dto.MenuDTO;
import com.example.food_delivery.model.Menu;
import com.example.food_delivery.model.Restaurant;
import com.example.food_delivery.repository.MenuDAO;
import com.example.food_delivery.repository.RestaurantDAO;

@Service
public class MenuService {
	
	@Autowired
	MenuDAO dao;
	
	@Autowired
	RestaurantDAO resDao;
	
	public String addMenu(MenuDTO dto) {
		Menu menu = new Menu();
		menu.setMenuId(dto.getMenuId());
		menu.setItemDescription(dto.getItemDescription());
		menu.setItemPrice(dto.getItemPrice());
		menu.setItemName(dto.getItemName());
		
		Optional<Restaurant> rs = resDao.findById(dto.getRestaurantId());
		if(rs.isPresent()) {
			menu.setRestaurant(rs.get());;
		}
		dao.save(menu);
		return "menu added successfully";
	}
	
	public List<Menu> getAllMenu(){
		List<Menu> menu = dao.findAll();
		return menu;
	}
}

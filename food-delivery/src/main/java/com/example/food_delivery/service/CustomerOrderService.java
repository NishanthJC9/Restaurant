package com.example.food_delivery.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.food_delivery.dto.CustomerOrderDTO;
import com.example.food_delivery.model.CustomerOrder;
import com.example.food_delivery.model.Restaurant;
import com.example.food_delivery.model.User;
import com.example.food_delivery.repository.CustomerOrderDAO;
import com.example.food_delivery.repository.RestaurantDAO;
import com.example.food_delivery.repository.UserDAO;

@Service
public class CustomerOrderService {

    @Autowired
    CustomerOrderDAO dao;

    @Autowired
    RestaurantDAO restDao;

    @Autowired
    UserDAO userDao;
    public String addOrder(CustomerOrderDTO dto) {
        CustomerOrder order = new CustomerOrder();
        order.setOrderId(dto.getOrderId());
        order.setOrderDate(dto.getOrderDate());
        order.setStatus(dto.getStatus());
        Optional<Restaurant> restaurant = restDao.findById(dto.getRestaurantId());
        Optional<User> user = userDao.findById(dto.getUserId());
        if(restaurant.isPresent() & user.isPresent()){
            order.setRestaurant(restaurant.get());
            order.setUser(user.get());
        }
        dao.save(order);
        return "Order saved successfully";
    }

}

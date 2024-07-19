package com.example.food_delivery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.food_delivery.dto.OrderItemDTO;
import com.example.food_delivery.model.OrderItem;
import com.example.food_delivery.service.OrderItemService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class OrderItemController {

    @Autowired
    OrderItemService service;

    @PostMapping("/addOrderItem")
    public String addOrderItem(@RequestBody OrderItemDTO dto) {       
        return service.addOrderItem(dto);
    }
    
    @GetMapping("/getAllOrderDetails")
    public List<OrderItem> getMethodName() {
        return service.getAllOrderItems();
    }
    
}

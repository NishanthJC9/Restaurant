package com.example.food_delivery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.food_delivery.dto.CustomerOrderDTO;
import com.example.food_delivery.service.CustomerOrderService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class CustomerOrderController {

    @Autowired
    CustomerOrderService service;

    @PostMapping("/addOrder")
    public String addOrder(@RequestBody CustomerOrderDTO dto) {        
        return service.addOrder(dto);
    }
    
}

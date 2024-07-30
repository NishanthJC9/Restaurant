package com.example.food_delivery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.food_delivery.dto.CustomerOrderDTO;
import com.example.food_delivery.exception.RecordNotFoundException;
import com.example.food_delivery.service.CustomerOrderService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class CustomerOrderController {

    @Autowired
    CustomerOrderService service;

    @PostMapping("/addOrder")
    public String addOrder(@RequestBody CustomerOrderDTO dto) {        
        return service.addOrder(dto);
    }
    
    @GetMapping("/getOrderById/{orderId}")
    public ResponseEntity<?> getOrderById(@PathVariable int orderId) {
        try{
            return service.getOrderById(orderId);
        }
        catch(RecordNotFoundException e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }
    
}

package com.example.food_delivery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.food_delivery.dto.OrderItemDTO;
import com.example.food_delivery.exception.RecordNotFoundException;
import com.example.food_delivery.model.OrderItem;
import com.example.food_delivery.service.OrderItemService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

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
    
    @GetMapping("/getOrderItemsById/{orderItemId}")
    public ResponseEntity<?> getMethodName(@PathVariable int orderItemId) {
        try {
            return service.getOrderByID(orderItemId);
        } catch (RecordNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }
    
}

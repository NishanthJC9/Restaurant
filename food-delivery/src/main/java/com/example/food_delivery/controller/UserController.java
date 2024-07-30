package com.example.food_delivery.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.food_delivery.dto.UserDTO;
import com.example.food_delivery.exception.RecordNotFoundException;
import com.example.food_delivery.model.User;
import com.example.food_delivery.service.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class UserController {

    @Autowired
    UserService user;
    @PostMapping("/addUser")
    public String addUser(@RequestBody UserDTO dto) {
        return user.addUser(dto);
    }
    
    @GetMapping("/getAllUser")
    public List<User> getAllUser() {
        return user.getAllUser();
    }
    
    @GetMapping("/getUserById/{userId}")
    public ResponseEntity<?> getUserById(@PathVariable int userId) {
        try {
            return user.getUserById(userId);
        } catch (RecordNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }
    
}

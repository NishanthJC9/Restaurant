package com.example.food_delivery.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.food_delivery.dto.UserDTO;
import com.example.food_delivery.model.User;
import com.example.food_delivery.repository.UserDAO;

@Service
public class UserService {

    @Autowired
    UserDAO dao;
    public String addUser(UserDTO dto) {
        User user = new User();
        user.setUserId(dto.getUserId());
        user.setUserName(dto.getUserName());
        user.setUserAddress(dto.getUserAddress());
        user.setUserEmail(dto.getUserEmail());
        user.setUserPhone(dto.getUserPhone());
        user.setUserPassword(dto.getUserPassword());
        dao.save(user);
        return "User added Successfully";
    }
    public List<User> getAllUser() {
        return dao.findAll();
    }


}

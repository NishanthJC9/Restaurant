package com.example.food_delivery.service;

import java.util.Optional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.food_delivery.dto.OrderItemDTO;
import com.example.food_delivery.model.CustomerOrder;
import com.example.food_delivery.model.Menu;
import com.example.food_delivery.model.OrderItem;
import com.example.food_delivery.repository.CustomerOrderDAO;
import com.example.food_delivery.repository.MenuDAO;
import com.example.food_delivery.repository.OrderItemDAO;

@Service
public class OrderItemService {

    @Autowired
    OrderItemDAO dao;

    @Autowired
    MenuDAO menuDao;

    @Autowired
    CustomerOrderDAO orderDao;

    public String addOrderItem(OrderItemDTO dto) {
        OrderItem item = new OrderItem();
        item.setOrderItemId(dto.getOrderItemId());
        item.setQuantity(dto.getQuantity());

        Optional<Menu> menu = menuDao.findById(dto.getMenuId());
        Optional<CustomerOrder> order = orderDao.findById((dto.getOrderId()));

        if(menu.isPresent() & order.isPresent()){
            item.setMenu(menu.get());
            item.setOrder(order.get());
        }

        dao.save(item);
        return "Item added successfully";
    }

    public List<OrderItem> getAllOrderItems(){
        return dao.findAll();
    }

}

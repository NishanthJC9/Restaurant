package com.example.food_delivery.dto;

import java.util.Date;

public class CustomerOrderDTO {

    private int orderId;
    private Date orderDate;
    private String status;
    private int restaurantId;
    private int userId;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CustomerOrderDTO(int orderId, Date orderDate, String status, int restaurantId, int userId) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.status = status;
        this.restaurantId = restaurantId;
        this.userId = userId;
    }

    public int getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(int restaurantId) {
        this.restaurantId = restaurantId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public CustomerOrderDTO() {
    }

}

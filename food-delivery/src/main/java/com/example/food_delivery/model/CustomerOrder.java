package com.example.food_delivery.model;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class CustomerOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;
    private Date orderDate;
    private String status;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="restaurantId", referencedColumnName = "restaurantId")
    private Restaurant restaurant;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="userId", referencedColumnName = "userId")
    private User user;

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

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public CustomerOrder(int orderId, Date orderDate, String status, Restaurant restaurant, User user) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.status = status;
        this.restaurant = restaurant;
        this.user = user;
    }

    @Override
    public String toString() {
        return "CustomerOrder [orderId=" + orderId + ", orderDate=" + orderDate + ", status=" + status + ", restaurant="
                + restaurant + ", user=" + user + "]";
    }

    public CustomerOrder() {
    }

}

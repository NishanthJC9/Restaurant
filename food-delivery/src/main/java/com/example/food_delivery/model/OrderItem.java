package com.example.food_delivery.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderItemId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "menuId", referencedColumnName = "menuId")
    private Menu menu;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customerOrderId", referencedColumnName = "orderId")
    private CustomerOrder order;

    private int quantity;

    public int getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(int orderItemId) {
        this.orderItemId = orderItemId;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public CustomerOrder getOrder() {
        return order;
    }

    public void setOrder(CustomerOrder order) {
        this.order = order;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public OrderItem(int orderItemId, Menu menu, CustomerOrder order, int quantity) {
        this.orderItemId = orderItemId;
        this.menu = menu;
        this.order = order;
        this.quantity = quantity;
    }

    public OrderItem() {
    }

    @Override
    public String toString() {
        return "OrderItem [orderItemId=" + orderItemId + ", menu=" + menu + ", order=" + order + ", quantity="
                + quantity + "]";
    }

}

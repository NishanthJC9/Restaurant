package com.example.food_delivery.dto;

public class OrderItemDTO {

    private int orderItemId;
    private int menuId;
    private int orderId;
    private int quantity;
    public OrderItemDTO(int orderItemId, int menuId, int orderId, int quantity) {
        this.orderItemId = orderItemId;
        this.menuId = menuId;
        this.orderId = orderId;
        this.quantity = quantity;
    }
    public OrderItemDTO() {
    }
    public int getOrderItemId() {
        return orderItemId;
    }
    public void setOrderItemId(int orderItemId) {
        this.orderItemId = orderItemId;
    }
    public int getMenuId() {
        return menuId;
    }
    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }
    public int getOrderId() {
        return orderId;
    }
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    @Override
    public String toString() {
        return "OrderItemDTO [orderItemId=" + orderItemId + ", menuId=" + menuId + ", orderId=" + orderId
                + ", quantity=" + quantity + "]";
    }
    
}

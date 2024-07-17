package com.example.food_delivery.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Restaurant {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private int restaurantId;
	private String restaurantName;
	private String restaurantEmail;
	private String restaurantAddress;
	private String restaurantPhone;
	@Override
	public String toString() {
		return "Restaurant [restaurantId=" + restaurantId + ", restaurantName=" + restaurantName + ", restaurantEmail="
				+ restaurantEmail + ", restaurantAddress=" + restaurantAddress + ", restaurantPhone=" + restaurantPhone
				+ "]";
	}
	public int getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public String getRestaurantEmail() {
		return restaurantEmail;
	}
	public void setRestaurantEmail(String restaurantEmail) {
		this.restaurantEmail = restaurantEmail;
	}
	public String getRestaurantAddress() {
		return restaurantAddress;
	}
	public void setRestaurantAddress(String restaurantAddress) {
		this.restaurantAddress = restaurantAddress;
	}
	public String getRestaurantPhone() {
		return restaurantPhone;
	}
	public void setRestaurantPhone(String restaurantPhone) {
		this.restaurantPhone = restaurantPhone;
	}
	public Restaurant(int restaurantId, String restaurantName, String restaurantEmail, String restaurantAddress,
			String restaurantPhone) {
		super();
		this.restaurantId = restaurantId;
		this.restaurantName = restaurantName;
		this.restaurantEmail = restaurantEmail;
		this.restaurantAddress = restaurantAddress;
		this.restaurantPhone = restaurantPhone;
	}
	public Restaurant() {
		super();
	}
	
}

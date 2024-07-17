package com.example.food_delivery.dto;


public class MenuDTO {
	
	private int menuId;
	private String itemName;
	private int itemPrice;
	private String itemDescription;
	
	private int restaurantId;

	public int getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}

	@Override
	public String toString() {
		return "MenuDTO [menuId=" + menuId + ", itemName=" + itemName + ", itemPrice=" + itemPrice
				+ ", itemDescription=" + itemDescription + ", restaurantId=" + restaurantId + "]";
	}

	public MenuDTO() {
		super();
	}

	public int getMenuId() {
		return menuId;
	}

	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public MenuDTO(int menuId, String itemName, int itemPrice, String itemDescription, int restaurantId) {
		super();
		this.menuId = menuId;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.itemDescription = itemDescription;
		this.restaurantId = restaurantId;
	}

	
	
}

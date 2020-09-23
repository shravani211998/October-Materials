package com.hsbc.collection;

public class Item {
	private int itemId;
	private String name;
	private double price;
	private double ratings;
	public Item() {
		super();
	}
	public Item(int itemId, String name, double price, double ratings) {
		super();
		this.itemId = itemId;
		this.name = name;
		this.price = price;
		this.ratings = ratings;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getRatings() {
		return ratings;
	}
	public void setRatings(double ratings) {
		this.ratings = ratings;
	}
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", name=" + name + ", price=" + price + ", ratings=" + ratings + "]";
	}
	
}

package com.hsbc.exam.entity;

public class FoodItems extends Product{
	
	private String dateOfMan;
	private String dateOfExpiry;
	private boolean vegetarian;
	private double quantity;
	
	public FoodItems() {
		
	}
	
	public FoodItems(int id, String name,double price,String dateOfMan,String dateOfExpiry, boolean vegetarian, double quantity) {
		super(id,name,price,quantity);
		this.dateOfMan=dateOfMan;
		this.dateOfExpiry=dateOfExpiry;
		this.vegetarian=vegetarian;
	
	}

	public String getDateOfMan() {
		return dateOfMan;
	}

	public void setDateOfMan(String dateOfMan) {
		this.dateOfMan = dateOfMan;
	}

	public String getDateOfExpiry() {
		return dateOfExpiry;
	}

	public void setDateOfExpiry(String dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	
	

}

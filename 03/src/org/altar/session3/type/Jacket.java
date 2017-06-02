package org.altar.session3.type;

import org.altar.session3.base.AbstractClothing;

public class Jacket extends AbstractClothing{
	private String brand;
	
	public Jacket(int itemId, String description, char colorCode, double price, String brand) {
		super(itemId, description, colorCode, price);
		
		this.setBrand(brand);
	}

	@Override
	public char getColorCode() {
		return colorCode;
	}

	@Override
	public void display() {
		System.out.println(String.format("My jacket id is %s and its brand is %s", itemId, brand));
	}
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
}

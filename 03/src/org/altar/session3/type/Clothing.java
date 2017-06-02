package org.altar.session3.type;

public class Clothing {
	private int itemId = 0;
	private String description = "description required";
	private char colorCode = 'U';
	private double price = 0.0;
	
	public Clothing(int itemId, String description, char colorCode, double price) {
		super();
		this.itemId = itemId;
		this.description = description;
		this.colorCode = colorCode;
		this.price = price;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public char getColorCode() {
		return colorCode;
	}

	public void setColorCode(char colorCode) {
		this.colorCode = colorCode;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public void display(){
		System.out.println("Item ID " + itemId);
		System.out.println("Description " + description);
		System.out.println("Color code " + colorCode);
		System.out.println("Price " + price);
	}
}

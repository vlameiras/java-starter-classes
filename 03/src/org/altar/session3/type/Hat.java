package org.altar.session3.type;

public class Hat extends Clothing{

	public Hat(int itemId, String description, char colorCode, double price) {
		super(itemId, description, colorCode, price);
	}
	
	public void display(){
		System.out.println("This is a hat!");
	}

}

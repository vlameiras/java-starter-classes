package org.altar.session3.type;

public class Shirt extends Clothing{
	private char fit = 'S';
	
	public Shirt(int itemId, String description, char colorCode, double price, char fit) {
		super(itemId, description, colorCode, price);
		
		this.fit = fit;
	}

	public char getFit() {
		return fit;
	}

	public void setFit(char fit) {
		this.fit = fit;
	}
	
	public void display(){
		System.out.println("This is a shirt!");
	}
	
	public void superDisplay(){
		super.display();
	}

}

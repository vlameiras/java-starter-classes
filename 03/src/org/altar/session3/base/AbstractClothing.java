package org.altar.session3.base;

public abstract class AbstractClothing {
	protected int itemId = 0;
	protected String description = "description required";
	protected char colorCode = 'U';
	protected double price = 0.0;
	
	public AbstractClothing(int itemId, String description, char colorCode, double price) {
		super();
		this.itemId = itemId;
		this.description = description;
		this.colorCode = colorCode;
		this.price = price;
	}

	public abstract char getColorCode();

	public abstract void display();

}

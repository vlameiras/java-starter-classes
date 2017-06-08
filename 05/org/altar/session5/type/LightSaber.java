package org.altar.session5.type;

public class LightSaber {
	private String color;
	private int power;
	
	public LightSaber(String color, int power) {
		this.color = color;
		this.power = power;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}
	
	public void strikes(String entity){
		System.out.println(entity + " attacks");
	}
	
}

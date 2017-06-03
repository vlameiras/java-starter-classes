package org.altar.session3.test;

public class PassByValueTest2 {
	public static void main(String[] args) {
		Shirt myShirt = new Shirt("X");
		
		System.out.println(myShirt.colorCode);	
		changeColorCode(myShirt);	
		System.out.println(myShirt.colorCode);
	}

	static void changeColorCode(Shirt shirt) {
		shirt.colorCode = "X";
		shirt = new Shirt("Y");
		shirt.colorCode = "Z";
	}
}

class Shirt {
	String colorCode;
	
	Shirt(String colorCode){
		this.colorCode = colorCode;
	}
}
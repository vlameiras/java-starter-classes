package org.altar.session3.test;

import org.altar.session3.type.Clothing;
import org.altar.session3.type.Shirt;

public class InheritanceTest {
	public static void main(String[] args) {
		Clothing clothing = new Shirt(1, "Blue shirt", 'B', 5.0, 'S');
		clothing.display();
		
		Shirt clothing2 = new Shirt(2, "Green shirt", 'C', 8.0, 'L');
		clothing2.superDisplay();
		
		
		Shirt newClothing = new Shirt(3, "Red shirt", 'D', 9.0, 'M');
		Clothing newSuperClothing = newClothing;
		Shirt backToSubClothing = (Shirt) newSuperClothing;
		backToSubClothing.display();
		
	}
}

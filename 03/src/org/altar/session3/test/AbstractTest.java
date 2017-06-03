package org.altar.session3.test;

import org.altar.session3.base.AbstractClothing;
import org.altar.session3.type.Jacket;

public class AbstractTest {
	public static void main(String[] args) {
		AbstractClothing jacket = new Jacket(5, "Black jacket", 'Y', 55.0, "Zara");
		System.out.println(jacket.getColorCode());
		jacket.display();
		
		System.out.println(((Jacket)jacket).getBrand());
	}
}

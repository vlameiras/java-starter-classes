package org.altar.session4.test;

/*
 * From Effective Java - Joshua Bloch
 */
public class WeightTable {
	public static void main(String[] args) {
		double earthWeight = 80.0;
		double mass = earthWeight / Planet.EARTH.surfaceGravity();
		for (Planet p : Planet.values())
			System.out.printf("Weight on %s is %f%n", p, p.surfaceWeight(mass));
	}
}
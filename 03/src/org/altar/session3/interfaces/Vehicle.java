package org.altar.session3.interfaces;

public interface Vehicle {
	void accelerate();
	
	default void print() {
		System.out.println("I am a vehicle!");
	}

	static void blowHorn() {
		System.out.println("Blowing horn!!!");
	}
}
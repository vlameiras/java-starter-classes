package org.altar.session3.interfaces;

public interface FourWheeler {
	default void print() {
		System.out.println("I am a four wheeler!");
	}
	default void printAlternative(){
		System.out.println("Alternative print for a four wheeler");
	}
}
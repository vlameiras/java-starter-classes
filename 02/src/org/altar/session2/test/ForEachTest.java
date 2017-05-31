package org.altar.session2.test;

public class ForEachTest {
	public static void main(String[] args) {
		int[] myInts = { 1, 4, 5, 6, 7, 20 };

		// Regular for iteration
		for (int i = 0; i < myInts.length; i++) {
			System.out.println(myInts[i]);
		}

		// foreach version
		for (int myInt : myInts) {
			System.out.println(myInt);
		}
	}
}

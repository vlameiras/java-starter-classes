package org.altar.session2.test;

import java.util.Scanner;

public class DoWhileScannerTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input;

		do {
			input = scanner.nextLine();
			System.out.println("Inserted " + input);
		} while (!input.equals("quit"));

		scanner.close();
		System.out.println("Thanks for using this amazing program!");
	}

}

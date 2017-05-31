package org.altar.session2.test;

import java.util.Scanner;

public class SwitchScannerTest {

	public static void main(String[] args) {
		int num;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please insert some numbers");

		while (true) {
			num = scanner.nextInt();
			switch (num) {
			case -1:
				scanner.close();
				System.out.println("Thanks, we're done here!");
				return;
			case 1:
				showNumberOne();
				break;
			case 2:
				showNumberTwo();
				break;
			case 3:
				showNumberThree();
				break;
			default:
				System.out.println("Sorry, we don't allow numbers greater than 3. Please try again.");
				break;
			}
		}
	}

	public static void showNumberOne() {
		System.out.println("Thanks for number one");
	}

	public static void showNumberTwo() {
		System.out.println("Thanks for number two");
	}

	public static void showNumberThree() {
		System.out.println("Thanks for number three");
	}
}

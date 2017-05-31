package org.altar.session2.test;

import java.util.Scanner;

public class ForScannerTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		for(String i = scanner.nextLine(); 
				!i.equals("quit"); 
				i = scanner.nextLine()){
			System.out.println("Inserted " + i);
		}
		
		scanner.close();
		System.out.println("Bye!");
	}
}

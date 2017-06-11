package org.altar.session7.test;

import java.util.Arrays;
import java.util.List;

public class LambdasTest {
	public static void main(String[] args) {
		// Before Java 8
		List <String>oldList = Arrays.asList("Cobol", "Pascal", "Fortran");
		for (String str : oldList) {
		   System.out.println(str);
		}

		// After Java 8
		List newList = Arrays.asList("Typescript", "Go", "Kotlin");		
		newList.forEach(n -> System.out.println(n));
		
		List newList2 = Arrays.asList("Javascript", "Scala", "Rust");	
		// Java 8 method reference
		newList.forEach(System.out::println);
	}
}

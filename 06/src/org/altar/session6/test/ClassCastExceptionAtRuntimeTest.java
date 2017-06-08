package org.altar.session6.test;

import java.util.ArrayList;
import java.util.List;

public class ClassCastExceptionAtRuntimeTest {
	public static void main(String[] args) {
		List myList = new ArrayList();
		myList.add("Altar");
		myList.add("Java Class");
		myList.add(new Integer(22));

		for(Object obj : myList){
		    System.out.println((String) obj);
		}
	}
}

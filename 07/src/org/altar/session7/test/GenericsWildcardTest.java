package org.altar.session7.test;

import java.util.ArrayList;
import java.util.List;

public class GenericsWildcardTest {
	public static void main(String[] args) {
		List<A> listA = new ArrayList<A>();
		List<B> listB = new ArrayList<B>();

		// Invalid
		// listA = listB; // Risk of inserting non-B values
		// listB = listA; // You would be able to insert A and C values into B

		// Types of wildcards
		/*
		 * List<?> myList = new ArrayList<A>(); List<? extends A> myList2 = new
		 * ArrayList<A>(); List<? super A> myList3 = new ArrayList<A>();
		 */

		// Unknown Wildcard - Works for any type
		/*
		 * List<A> listA = new ArrayList<A>(); 
		 * processElements(listA);
		 */

		// Extends Wildcard - Works for any instance of A or subclass of A
		// But you still can't insert because you don't know if the type would
		// be A, B or C
		/*
		 * List<A> listA = new ArrayList<A>(); 
		 * processElements(listA);
		 * 
		 * List<B> listB = new ArrayList<B>(); 
		 * processElements(listB);
		 * 
		 * List<C> listC = new ArrayList<C>(); 
		 * processElements(listC);
		 */

		// Super Wildcard - type is A or super class of A
		// safe for insertion, but not for reading

		/*
		 * List<? super A> listSuperA = new ArrayList<A>();
		 * insertElements(listSuperA);
		 * 
		 * List<Object> listObject = new ArrayList<Object>();
		 * insertElements(listObject);
		 * 
		 * Object object = listSuperA.get(0); 
		 * A objGeneric = listSuperA.get(0);
		 * //May be a super class of A objGeneric.sayName();
		 */

	}

	public static void processElements(List<A> elements) {
		for (A o : elements) {
			o.sayName();
		}
	}

	public void processElementsUnknown(List<?> elements) {
		for (Object o : elements) {
			System.out.println(o);
		}
	}

	public void processElementsExtends(List<? extends A> elements) {
		for (A a : elements) {
			a.sayName();
		}
	}

	public static void insertElements(List<? super A> list) {
		list.add(new A());
		list.add(new B());
		list.add(new C());
	}

}

class A {
	public void sayName() {
		System.out.println("My name is A");
	}
}

class B extends A {
}

class C extends A {
}
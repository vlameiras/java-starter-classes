package org.altar.session6.test;

public class StandardWithGeneric<T> {
	private T t;

	public T get() {
		return this.t;
	}

	public void set(T t) {
		this.t = t;
	}

	public static void main(String args[]) {
		StandardWithGeneric<String> generic = new StandardWithGeneric<>();
		generic.set("Hello");

		StandardWithGeneric generic1 = new StandardWithGeneric(); 
		generic1.set("Pankaj"); // valid
		generic1.set(10); // valid and autoboxing support
	}
}

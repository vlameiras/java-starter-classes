package org.altar.session3.test;

public class StaticNullTest {
	public static void main(String[] args) {
		Person p = new Person();
		p = null;
		p.speak("Use the force, Luke.");
	}

}

class Person {
	public static void speak(String speech) {
		System.out.println(speech);
	}
}
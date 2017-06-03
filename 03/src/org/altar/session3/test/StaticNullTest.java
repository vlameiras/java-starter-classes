package org.altar.session3.test;

public class StaticNullTest {
	public static void main(String[] args) {
		Person jedi = new Person();
		jedi = null;
		jedi.speak("Use the force, Luke.");
		Person.speak("Greetings");
	}

}

class Person {
	public static void speak(String speech) {
		System.out.println(speech);
	}
}
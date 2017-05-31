package org.altar.session2.test;

public class StringBuilderTest {
	public static void main(String[] args) {
		// Create a new StringBuilder
		StringBuilder strBuilder = new StringBuilder("Hello");
		// Inline append
		strBuilder.append(" World").append(". Bye!");

		// Insert
		strBuilder.insert(1, "OOPS");

		// Delete the previous String
		strBuilder.delete(1, 5);

		// Obtain the String
		System.out.println(strBuilder.toString());

		// startsWith() example
		String myString = "My class is awesome!";
		System.out.println(myString.startsWith("My"));
	}
}

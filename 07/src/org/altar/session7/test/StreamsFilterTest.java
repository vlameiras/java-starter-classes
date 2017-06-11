package org.altar.session7.test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamsFilterTest {
	public static void main(String[] args) {
		List<String> languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");

		System.out.println("Languages which starts with J :");
		filter(languages, (str) -> str.startsWith("J"));

		System.out.println("Languages which ends with a ");
		filter(languages, (str) -> str.endsWith("a"));

		System.out.println("Print all languages :");
		filter(languages, (str) -> true);

		System.out.println("Print no language : ");
		filter(languages, (str) -> false);

		System.out.println("Print language with length greater than 4:");
		filter(languages, (str) -> str.length() > 4);

		Predicate<String> startsWithJ = (n) -> n.startsWith("J");
		Predicate<String> fourLetterLong = (n) -> n.length() == 5;

		languages.stream().filter(startsWithJ.and(fourLetterLong))
				.forEach((n) -> System.out.println("Languages which start with J and have 4 letters " + n));

	}

	public static void filter(List<String> names, Predicate<String> condition) {
		for (String name : names) {
			if (condition.test(name)) {
				System.out.println(name + " ");
			}
		}
	}

}

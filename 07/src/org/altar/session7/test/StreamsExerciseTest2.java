package org.altar.session7.test;

import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamsExerciseTest2 {
	public static void main(String[] args) {
		List<String> oldList = Arrays.asList("Cobol", "Scala", "C++", "Haskell", "Lisp");
		List<String> newList = Arrays.asList("Python", "Go", "Kotlin", "Rust", "Scala");

		// Before Java 8
		oldList = transform7(oldList);
		for (String str : oldList) {
			System.out.println(str);
		}

		// Java 8
		newList = transform(newList);
		newList.stream().forEach(System.out::println);
	}

	public static List<String> transform7(List<String> collection) {
		List<String> coll = new ArrayList<>();
		for (String element : collection) {
			coll.add(element.toUpperCase());
		}
		return coll;
	}

	public static List<String> transform(List<String> collection) {
		return collection.stream() // Convert collection to Stream
				.map(String::toUpperCase) // Convert each element to upper case
				.collect(toList()); // Collect results to a new list
	}

}
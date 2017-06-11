package org.altar.session7.test;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class OperationsTest {
	public static void main(String[] args) {
		List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
		IntSummaryStatistics stats = primes.stream().mapToInt((x) -> x).summaryStatistics();

		System.out.println("Highest prime number in List : " + stats.getMax());
		System.out.println("Lowest prime number in List : " + stats.getMin());
		System.out.println("Sum of all prime numbers : " + stats.getSum());
		System.out.println("Average of all prime numbers : " + stats.getAverage());

		// MAP
		// Old way:
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		for (Integer n : list) {
			int x = n * n;
			System.out.println(x);
		}

		// New way:
		List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		list2.stream().map((x) -> x * x).forEach(System.out::println);

		// REDUCE
		// Old way:
		List<Integer> list3 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		int sum = 0;
		for (Integer n : list3) {
			int x = n * n;
			sum = sum + x;
		}
		System.out.println(sum);

		// New way:
		List<Integer> list4 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		int sum2 = list4.stream().map(x -> x * x).reduce((x, y) -> x + y).get();
		System.out.println(sum2);
	}
}

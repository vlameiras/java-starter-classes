package org.altar.session4.test;

import java.util.LinkedHashMap;

public class LinkedHashMapTest {
	public static void main(String[] args) {
		LinkedHashMap<Integer, Book> map = new LinkedHashMap<>();

		map.put(1, new Book("Dune", "Frank Herbert"));
		map.put(2, new Book("Effective Java", "Joshua Bloch"));
		map.put(3, new Book("Brave New World", "Aldous Huxley"));

		// Iterate over values
		for (Book book : map.values()) {
			book.display();
		}

		//iterating over keys only
		for (Integer key : map.keySet()) {
		    System.out.println("Key = " + key);
		}

		// Remove a Book
		map.remove(2);
		System.out.println("Size after remove -> " + map.size());

		// Get a specific Book by id
		Book book3 = map.get(3);
		System.out.println("Getting book #3 -> " + book3.toString());

		// Better safe than sorry
		System.out.println(map.containsKey(5) ? map.get(5).toString() : "No Book found");

		// Check if empty
		System.out.println("Is it empty ? " + map.isEmpty());

		// Later
		map.forEach((k, v) -> {
			System.out.println(k + ":" + v.toString());
		});
	}
}

class Book {
	private String title;
	private String author;

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void display() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + "]";
	}

}
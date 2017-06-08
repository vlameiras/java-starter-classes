package org.altar.session5.test;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import org.altar.session5.annotation.MyAnnotation;

public class AnnotationTest {

	public static void main(String[] args) {
	}

	@Override
	@MyAnnotation(author = "Altar", comments = "Main method", date = "2017-06-07", revision = 1)
	public String toString() {
		return "Overriden toString method";
	}

	@Deprecated
	@MyAnnotation(comments = "deprecated method", date = "2012-06-07")
	public static void oldMethod() {
		System.out.println("old method, don't use it.");
	}

	@SuppressWarnings({ "unchecked", "deprecation" })
	@MyAnnotation(author = "Altar", comments = "Main method", date = "2017-06-07", revision = 10)
	public static void genericsTest() throws FileNotFoundException {
		List l = new ArrayList();
		l.add("abc");
		oldMethod();
	}

}
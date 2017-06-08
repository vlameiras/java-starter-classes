/*package org.altar.session5.test;

import java.net.URL;

import org.altar.session5.exception.MyException;

public class ExceptionTest {

	public void storeDataFromFile(String file) {
		String data = readDataFromFile(file);
	}

	public String readDataFromFile(String file) {
		if (!isFileOK(file)) {
			throw new MyException("Something went wrong: " + file);
		}
		String data = getSomeData();
		return data;
	}

	private boolean isFileOK(String file) {
		return false;
	}

	private String getSomeData() {
		return "Some data";
	}

	public static void main(String[] args) {

		testFile();
	}
	
	private static void testFile(){
		try {
			URL url = new URL("http://www.google.pt");
			System.out.println(url.getContent());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			System.out.println("Finally!");
		}
		
	}
}*/

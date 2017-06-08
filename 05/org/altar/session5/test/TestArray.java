package org.altar.session5.test;

public class TestArray {

	public static void main(String[] args) {
		MyArray myArray = new MyArray();
		myArray.add(5, 23);
		System.out.println("Fim");
	}
}

class MyArray{
	int [] myArrayInt = new int[5];
	
	public void add(int index, int value){
		try{
			System.out.println();
			
			myArrayInt[index] = value;
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println();
		}
	}
}

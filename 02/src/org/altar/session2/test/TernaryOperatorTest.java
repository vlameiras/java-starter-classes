package org.altar.session2.test;

public class TernaryOperatorTest {

	public static void main(String[] args) {
		int a = 50;
		int b = 30;
		
		/*if(a > b){
			a = a + b;
		} else {
			a = a - b;
		}*/
		
		//Converting above if else chain to ternary
		int result = (a > b ?  ( b ) : a - b);
		
		System.out.println("a is equal to " + result);
	}

}

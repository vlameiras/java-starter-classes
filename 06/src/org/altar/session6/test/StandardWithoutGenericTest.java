package org.altar.session6.test;

public class StandardWithoutGenericTest {
	private Object t;

	public Object get() {
		return t;
	}

	public void set(Object t) {
		this.t = t;
	}

	public static void main(String args[]) {
		StandardWithoutGenericTest obj = new StandardWithoutGenericTest();
		obj.set(new Integer(1));
		
		String str = (String) obj.get();
	}
}

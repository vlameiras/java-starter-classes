package org.altar.session5.test;

import org.altar.session5.exception.LightSaberNotFoundException;
import org.altar.session5.type.Jedi;
import org.altar.session5.type.LightSaber;

public class CustomExceptionTest {
	public static void main(String[] args) throws LightSaberNotFoundException {
		LightSaber blueLightSaber = new LightSaber("Blue", 10);
		Jedi obiWan = new Jedi(blueLightSaber);
		Jedi lukeSkywalker = new Jedi(null);
		
		obiWan.attack();
		lukeSkywalker.attack();
	}
}

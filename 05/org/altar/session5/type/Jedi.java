package org.altar.session5.type;

import org.altar.session5.exception.LightSaberNotFoundException;
import org.altar.session5.test.LightSaberException;

public class Jedi extends ForceBearer{

	public Jedi(LightSaber lightSaber) {
		super(lightSaber);
	}

	@Override
	public void attack() throws LightSaberNotFoundException {
		try {
			this.getLightSaber().strikes("Jedi");
		} catch (NullPointerException e) {
			throw new LightSaberNotFoundException("Nooo"); 
		}
	}

}

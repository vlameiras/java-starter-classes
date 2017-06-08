package org.altar.session5.type;

import org.altar.session5.exception.LightSaberNotFoundException;

public abstract class ForceBearer {
	private LightSaber lightSaber;
	
	public abstract void attack() throws LightSaberNotFoundException;
	
	public ForceBearer(LightSaber lightSaber) {
		this.lightSaber = lightSaber;
	}

	public LightSaber getLightSaber() {
		return lightSaber;
	}

	public void setLightSaber(LightSaber lightSaber) {
		this.lightSaber = lightSaber;
	}
	
	
}

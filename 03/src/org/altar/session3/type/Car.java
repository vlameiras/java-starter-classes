package org.altar.session3.type;

import org.altar.session3.interfaces.FourWheeler;
import org.altar.session3.interfaces.Vehicle;

public class Car implements Vehicle, FourWheeler {
	public void print(){
//		Vehicle.super.print();
//		FourWheeler.super.print();
		System.out.println("I'm a car");
	}

	@Override
	public void accelerate() {
		System.out.println("Vroooom");
	}
}
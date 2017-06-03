package org.altar.session3.test;

import org.altar.session3.interfaces.Vehicle;
import org.altar.session3.type.Car;

public class InterfaceTester {
	public static void main(String args[]) {
		Car car = new Car();
		car.print();
		car.accelerate();
		car.printAlternative();
		
		Vehicle.blowHorn();
	}
}


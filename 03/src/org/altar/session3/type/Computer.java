package org.altar.session3.type;

/*
 * HAS-A example
 */

class HardDisk {
	public void writeData(String data) {
		System.out.println("Data is being written : " + data);
	}
}

class Computer {
	private HardDisk seagate = new HardDisk();

	public void save(String data) {
		seagate.writeData(data);
	}
}
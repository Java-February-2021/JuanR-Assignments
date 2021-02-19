package com.juan.zooKeeper1;

public class Mammal {
	public int energyLevel = 100;
	

	public int displayEnergy() {
		System.out.println("Your enegery level is" + energyLevel);
		return energyLevel;
	}
	public Mammal(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
}

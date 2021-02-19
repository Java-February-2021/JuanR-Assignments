package com.juan.zooKeeper1;

public class Bat extends Mammal{
	
	public Bat(int energyLevel) {
		super(energyLevel);
	}

	public int energyLevel = 300;

	public void fly() {
		System.out.print("wooosh");
		energyLevel -= 50;
	}
	
	public void eatHumans() {
		System.out.print("Eating humans");
		energyLevel += 25;
	}
	
	public void attackTown() {
		System.out.print("Attacking the town");
		energyLevel -= 100;
	}
	
	
}

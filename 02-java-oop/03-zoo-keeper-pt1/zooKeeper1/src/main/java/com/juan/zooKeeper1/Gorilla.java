package com.juan.zooKeeper1;

public class Gorilla extends Mammal{
	public Gorilla(int energyLevel) {
		super(energyLevel);
	}
	public void throwObject() {
		System.out.print("throw");
		energyLevel = -5;
	}
	
	public void eatBanana() {
		System.out.print("eat banana");
		energyLevel += 5;
	}
	public void climb() {
		System.out.print("climb");
		energyLevel -= 2;
	}
}

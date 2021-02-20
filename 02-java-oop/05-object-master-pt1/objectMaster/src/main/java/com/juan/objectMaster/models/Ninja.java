package com.juan.objectMaster.models;

public class Ninja extends Human {
	public Ninja() {
	this.stealth = 10;
	}
	
	public void steal(Human target) {
		System.out.print("stole");
		target.health -= this.stealth;
		target.health += this.stealth;
	}
	
	public void runAway() {
		System.out.println("Ninja ran away");
		this.health = -10;
	}
	
}

package com.juan.objectMaster.models;

public class Samurai extends Human{
	public Samurai() {
		this.health = 200;
	}
	public void deathBlow(Human target) {
		target.health = 0;
		this.health = (this.health/2);
	}
	public void meditate() {
		this.health += (this.health * 2);
	}
}

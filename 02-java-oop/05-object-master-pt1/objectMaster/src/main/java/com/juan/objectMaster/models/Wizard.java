package com.juan.objectMaster.models;

public class Wizard extends Human{
	int health = 50; 
	int intelligenct = 8;
	
	public void heal(Human target) {
		target.health += this.intelligence;
	}
	
	public void fireball(Human target){
	    target.health -= (this.intelligence * 3);
	}
	
	
}

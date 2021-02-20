package com.juan.phone.models;

import com.juan.phone.interfaces.Ringable;

public class Galaxy extends Phone implements Ringable{
	int versionNumber;
	int batteryPercentage;
	String carrier;
	String ringTone;
	
	@Override
	public String ring() {
	return "Galaxy is ringing";
	}
	
	@Override
	public String unlock() {
		return "Galaxy has been unlocked";
	}
	@Override
	public void displayInfo() {
		
	}

	public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
	}
	
}

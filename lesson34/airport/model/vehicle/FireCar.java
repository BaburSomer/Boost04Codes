package com.bilgeadam.course04.lesson34.airport.model.vehicle;

import java.util.StringTokenizer;

import com.bilgeadam.course04.lesson34.airport.model.common.Commons;

public class FireCar extends Vehicle{
	private boolean serving;
	
	public FireCar(String name, boolean serving, int maxSpeed) {
		super();
		this.serving = serving;
		this.setVehicleName(name);
		this.setMaxSpeed(maxSpeed);
	}

	public static void parse (String line) {
		// Type;Name;MaxSpeed;Company;Capacity;Purpose
		// FIRECAR;S�ND�R-1;120;;;
		StringTokenizer tokenizer = new StringTokenizer(line, ";");
		tokenizer.nextToken(); // FIRECAR
		String name = tokenizer.nextToken(); // S�ND�R-1
		int maxSpeed = Integer.parseInt(tokenizer.nextToken()); // 120
		FireCar car = new FireCar(name, false, maxSpeed);
		Commons.getInstance().getVehicles().add(car);
	}

	@Override
	public String toString() {
		return "ServiceCar [serving=" + this.serving + ", getName()=" + this.getVehicleName()
				+ ", getMaxSpeed()=" + this.getMaxSpeed() + "]";
	}


}

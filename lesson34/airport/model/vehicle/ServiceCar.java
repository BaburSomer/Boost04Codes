package com.bilgeadam.course04.lesson34.airport.model.vehicle;

import java.util.StringTokenizer;

import com.bilgeadam.course04.lesson34.airport.model.common.Commons;

public class ServiceCar extends Vehicle {
	private String  purpose;
	private boolean serving;
	
	public ServiceCar(String name, String purpose, boolean serving, int maxSpeed) {
		super();
		this.purpose = purpose;
		this.serving = serving;
		this.setVehicleName(name);
		this.setMaxSpeed(maxSpeed);
	}

	public static void parse (String line) {
		// Type;Name;MaxSpeed;Company;Capacity;Purpose
		// SERVICE;SERVIS-1;60;;;BUS
		StringTokenizer tokenizer = new StringTokenizer(line, ";");
		tokenizer.nextToken(); // SERVICE
		String name = tokenizer.nextToken(); // SERVIS-1
		int maxSpeed = Integer.parseInt(tokenizer.nextToken()); // 60
		tokenizer.nextToken(); // company ignored
		tokenizer.nextToken(); // capacity ignored
		String purpose = tokenizer.nextToken();
		ServiceCar car = new ServiceCar(name, purpose, false, maxSpeed);
		Commons.getInstance().getVehicles().add(car);
	}
	
	public String getPurpose() {
		return this.purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	@Override
	public String toString() {
		return "ServiceCar [purpose=" + this.purpose + ", serving=" + this.serving + ", getName()=" + this.getVehicleName()
				+ ", getMaxSpeed()=" + this.getMaxSpeed() + "]";
	}

}

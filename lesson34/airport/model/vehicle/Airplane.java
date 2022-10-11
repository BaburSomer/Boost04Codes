package com.bilgeadam.course04.lesson34.airport.model.vehicle;

import java.util.StringTokenizer;

import com.bilgeadam.course04.lesson34.airport.model.common.Commons;

public class Airplane extends Vehicle {
	private String    company;
	private final int capacity;

	public Airplane(String name, String company, int capacity, int maxSpeed) {
		this.company  = company;
		this.capacity = capacity;
		this.setVehicleName(name);
		this.setMaxSpeed(maxSpeed);
		do {
			this.timeInAir = this.rnd.nextInt(10) * 5000;
		} while (this.timeInAir == 0);
		
		do {
			this.timeAtAirport = this.rnd.nextInt(10) * 10000;
		} while (this.timeAtAirport == 0);
	}

	public static void parse(String line) {
		//Type;Name;Maxspeed;Fueltype;Purpose;serving;cateringCompany;Company;capacity;onduty
		//AIRPLANE;AIRBUS380;860;Kerosin;;;;THY;150;
		
		StringTokenizer tokenizer = new StringTokenizer(line, ";");
		tokenizer.nextToken(); // AIRPLANE
		String   name     = tokenizer.nextToken(); //Name
		int      maxSpeed = Integer.parseInt(tokenizer.nextToken()); // MaxSpeed
		String   fuelType = tokenizer.nextToken(); // fueltype
		String   company  = tokenizer.nextToken(); // company
		int      capacity = Integer.parseInt(tokenizer.nextToken());
		
		Airplane airplane = new Airplane(name, company, capacity, maxSpeed);
		Commons.getInstance().getVehicles().add(airplane);
	}

	public String getCompany() {
		return this.company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getCapacity() {
		return this.capacity;
	}

	@Override
	public String toString() {
		return "Airplane [company=" + this.company + ", capacity=" + this.capacity + ", getVehicleName()="
				+ this.getVehicleName() + ", getTimeInAir()=" + this.getTimeInAir() + ", getTimeAtAirport()="
				+ this.getTimeAtAirport() + ", getAirport()=" + this.getAirport() + "]";
	}

}

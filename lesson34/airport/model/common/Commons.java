package com.bilgeadam.course04.lesson34.airport.model.common;

import java.util.HashSet;

import com.bilgeadam.course04.lesson34.airport.model.vehicle.Vehicle;

// SINGLETON PATTERN
public class Commons {
	private static Commons   instance;
	private HashSet<Vehicle> vehicles;

	private Commons() {
		this.vehicles = null;
	}

	public static Commons getInstance() { // lazy initialization
		if (Commons.instance == null) {
			Commons.instance = new Commons();
		}
		return Commons.instance;
	}

	public HashSet<Vehicle> getVehicles() {  // lazy initialization 
		if (this.vehicles == null) {
			this.vehicles = new HashSet<>();
		}
		return this.vehicles;
	}
}

package com.bilgeadam.course04.lesson34.airport.model.airport;

import com.bilgeadam.course04.lesson34.airport.model.vehicle.Vehicle;

public interface Passable {
	void enter(Vehicle vehicle) throws InterruptedException;
	void leave(Vehicle vehicle);
}

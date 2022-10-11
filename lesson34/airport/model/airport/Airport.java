package com.bilgeadam.course04.lesson34.airport.model.airport;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import com.bilgeadam.course04.lesson34.airport.model.vehicle.Vehicle;

public class Airport implements Passable {
	private static final int               CAPACITY = 1;
	private volatile AtomicInteger         numOfPlanes;
	private final String                   name;
	private final List<Vehicle>            waitingList;
	private final List<Vehicle>            synchWaitingList;
	
	public Airport(String name) {
		super();
		this.name        = name;
		this.numOfPlanes = new AtomicInteger(0);
		this.waitingList = new ArrayList<>();
		this.synchWaitingList = Collections.synchronizedList(waitingList);
	}

	public String getName() {
		return this.name;
	}

	@Override
	public synchronized void enter(Vehicle vehicle) throws InterruptedException {
		this.synchWaitingList.add(vehicle);

		if (!isAbleToEnter(vehicle)) {
			System.out.println(this.numOfPlanes.get() + " planes at <<<<" + this.name + ">>> Airport");
			wait();
		}
	}

	private synchronized boolean isAbleToEnter(Vehicle vehicle) {
		int pos = this.synchWaitingList.indexOf(vehicle);
		System.out.println(vehicle.getVehicleName() + " is at the <<<" + pos + ">>> position");

		int numOfAirplanes = this.numOfPlanes.get();
		if ((numOfAirplanes >= Airport.CAPACITY) || (pos != 0)) {
			return false;
		}
		this.synchWaitingList.remove(vehicle);
		int num = this.numOfPlanes.incrementAndGet();
		System.out.println(num + " planes at " + this.name + " Airport");
		return true;
	}

	@Override
	public synchronized void leave(Vehicle vehicle) {
		int numOfPlanes = this.numOfPlanes.decrementAndGet();
		if (numOfPlanes <= 0) {
			this.numOfPlanes.set(0);
		}
		notify();
	}
}

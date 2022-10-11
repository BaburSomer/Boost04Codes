package com.bilgeadam.course04.lesson34.airport.model.vehicle;

import java.util.Random;

import com.bilgeadam.course04.lesson34.airport.model.airport.Airport;

public abstract class Vehicle extends Thread {

	private String   vehicleName;
	private int      maxSpeed;
	protected Random rnd = new Random();
	protected int    timeInAir;
	protected int    timeAtAirport;
	private Airport  airport;

	public String getVehicleName() {
		return this.vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public int getMaxSpeed() {
		return this.maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getTimeInAir() {
		return this.timeInAir;
	}

	public void setTimeInAir(int timeInAir) {
		this.timeInAir = timeInAir;
	}

	public int getTimeAtAirport() {
		return this.timeAtAirport;
	}

	public void setTimeAtAirport(int timeAtAirport) {
		this.timeAtAirport = timeAtAirport;
	}

	@Override
	public void run() {
		try {
			while (true) {
				System.out.println(">>> approaching " + this.getVehicleName() + " to " + this.getAirport().getName() +  " Airport");
				Thread.sleep(timeInAir);
				System.out.println("+++ entered " + this.getVehicleName() + " in " + this.getAirport().getName() +  " Airport");
				this.airport.enter(this);
				
				System.out.println("ooo is " + this.getVehicleName() + " at " + this.getAirport().getName() +  " Airport");
				Thread.sleep(timeAtAirport);
				System.out.println("<<< " + this.getVehicleName() + " leaving " + this.getAirport().getName() +  " Airport");
				this.airport.leave(this);
				System.out.println("--- has left " + this.getVehicleName() + " " + this.getAirport().getName() +  " Airport");
			}
		}
		catch (InterruptedException ex) {
			throw new AssertionError(ex);
		}
	}

	public Airport getAirport() {
		return this.airport;
	}

	public void setAirport(Airport airport) {
		this.airport = airport;
	}

}

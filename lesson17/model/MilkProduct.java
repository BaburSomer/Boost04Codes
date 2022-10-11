package com.bilgeadam.course04.lesson17.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class MilkProduct extends AnimalProduct implements Perishable {
	private boolean bottled;
	private boolean lactoseFree;

	public MilkProduct(String name, UnitType unit, double unitPrice, int quantity, LocalDate productionDate,
			AnimalProductType type, boolean bottled, boolean lactoseFree) {
		super(name, unit, unitPrice, quantity, productionDate, type);
		this.bottled = bottled;
		this.lactoseFree = lactoseFree;
	}


	

	@Override
	public boolean isPerished() {
		return this.expired();
	}

	@Override
	public int getDaysToPerish() {
		LocalDate today = LocalDate.now();
		long days = this.getProductionDate().until(today, ChronoUnit.DAYS);
		return getShelfLifeInDays() - (int)days;
	}

	@Override
	public boolean expired() {
		LocalDate today = LocalDate.now();
		long days = this.getProductionDate().until(today, ChronoUnit.DAYS);
		return days > this.getShelfLifeInDays();
	}

	public int getShelfLifeInDays() {
		return 10;
	}

	public boolean isBottled() {
		return bottled;
	}

	public void setBottled(boolean bottled) {
		this.bottled = bottled;
	}

	public boolean isLactoseFree() {
		return lactoseFree;
	}

	public void setLactoseFree(boolean lactoseFree) {
		this.lactoseFree = lactoseFree;
	}

	@Override
	public String toString() {
		return "MilkProduct [shelfLifeInDays=" + this.getShelfLifeInDays() + ", bottled=" + bottled + ", lactoseFree="
				+ lactoseFree + ", type=" + this.getType() + ", toString()=" + super.toString() + "]";
	}

}

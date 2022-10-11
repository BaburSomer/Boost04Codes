package com.bilgeadam.course04.lesson17.model;

import java.time.LocalDate;

public class Cereals extends Product implements Wholesaleable {

	public Cereals(String name, UnitType unit, double unitPrice, int quantity, LocalDate productionDate) {
		super(name, unit, unitPrice, quantity, productionDate);
	}

	@Override
	public boolean expired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getWholeUnitAmount() {
		return 10;
	}

}

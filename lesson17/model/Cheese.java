package com.bilgeadam.course04.lesson17.model;

import java.time.LocalDate;

public class Cheese extends MilkProduct implements Perishable  {
	private CheeseProductType type;
	
	
	public Cheese(String name, UnitType unit, double unitPrice, int quantity, LocalDate productionDate,
			AnimalProductType type, boolean bottled, boolean lactoseFree) {
		super(name, unit, unitPrice, quantity, productionDate, type, bottled, lactoseFree);
		// TODO Auto-generated constructor stub
	}


	@Override
	public int getDaysToPerish() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getShelfLifeInDays() {
		return 5;
	}

	@Override
	public boolean expired() {
		// TODO Auto-generated method stub
		return false;
	}
}

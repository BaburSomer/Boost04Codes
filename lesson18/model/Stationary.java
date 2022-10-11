package com.bilgeadam.course04.lesson18.model;

import java.time.LocalDate;

public class Stationary extends Product{
	private Color color;

	public Stationary(String name, LocalDate productionDate, int availableAmount, double basePrice, Color color) {
		super(name, productionDate, availableAmount, basePrice);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	@Override
	public String toString() {
		return "Stationary [color=" + color + ", toString()=" + super.toString() + "]";
	}
}

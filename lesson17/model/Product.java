package com.bilgeadam.course04.lesson17.model;

import java.time.LocalDate;

public abstract class Product { 
	private String name;
	private UnitType unit;
	private double unitPrice;
	private int    quantity;
	private LocalDate productionDate;

	public Product(String name, UnitType unit, double unitPrice, int quantity, LocalDate productionDate) {
		super();
		this.name = name;
		this.unit = unit;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
		this.productionDate = productionDate;
	}

	public abstract boolean expired();  // abstract method  -- gövdesi olmayan methodlar
	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public UnitType getUnit() {
		return unit;
	}

	public void setUnit(UnitType unit) {
		this.unit = unit;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public LocalDate getProductionDate() {
		return productionDate;
	}

	public void setProductionDate(LocalDate productionDate) {
		this.productionDate = productionDate;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", unit=" + unit + ", unitPrice=" + unitPrice + ", quantity=" + quantity
				+ ", productionDate=" + productionDate + "]";
	}
	
	
}

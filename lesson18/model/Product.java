package com.bilgeadam.course04.lesson18.model;

import java.time.LocalDate;

public abstract class Product {
	private String name;
	private LocalDate productionDate;
	private int availableAmount;
	private double basePrice;
	
	public Product(String name, LocalDate productionDate, int availableAmount, double basePrice) {
		super();
		this.name = name;
		this.productionDate = productionDate;
		this.availableAmount = availableAmount;
		this.basePrice = basePrice;
	}

	
	public void sellProduct(int amount, double discountRate) {
		if (amount < availableAmount) {
			double price = basePrice -(basePrice * discountRate);
			double endPrice = price * amount;
			System.out.println(amount + " adet " + this.name + " adlı ürünün toplam satış fiyatı : " + endPrice);
			availableAmount -= amount;
		}
		else {
			System.err.println("Almak istediğiniz üründen yeteri kadar yok");
		}
	}


	public int getAvailableAmount() {
		return availableAmount;
	}


	public void setAvailableAmount(int availableAmount) {
		this.availableAmount = availableAmount;
	}


	public double getBasePrice() {
		return basePrice;
	}


	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}


	public String getName() {
		return name;
	}


	public LocalDate getProductionDate() {
		return productionDate;
	}


	@Override
	public String toString() {
		return "Product [name=" + name + ", productionDate=" + productionDate + ", availableAmount=" + availableAmount
				+ ", basePrice=" + basePrice + "]";
	}
	
}

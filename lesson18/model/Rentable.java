package com.bilgeadam.course04.lesson18.model;

public interface Rentable {
	int getAvailableAmountInfo();
	String getNameInfo();
	void updateAmountInfo(int amount);
	
	default void rent(int amount, Period rentalPeriod, int rentalTime) {
		if (amount < this.getAvailableAmountInfo()) {
			System.out.println(amount + " adet " + this.getNameInfo() + " adlı ürün kiraya verildi");
			this.updateAmountInfo(this.getAvailableAmountInfo() - amount);
		} else {
			System.err.println("Almak istediğiniz üründen yeteri kadar yok");
		}
	}

	default void returnRental(int amount) {
		this.updateAmountInfo(this.getAvailableAmountInfo() + amount);
	}
}

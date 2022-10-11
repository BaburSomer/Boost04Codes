package com.bilgeadam.course04.lesson17.model;

public interface Wholesaleable {
	
	default double getDiscountRate() {
		return 0.15;
	}
	
	int getWholeUnitAmount();
}

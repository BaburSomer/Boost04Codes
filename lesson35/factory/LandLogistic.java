package com.bilgeadam.course04.lesson35.factory;

public class LandLogistic implements Logistic {
	
	@Override
	public void deliver(String good) {
		System.out.println("Karadan mal taşırız");
		
	}

	@Override
	public void accept(String good) {
		System.out.println("Karadan mal kabul ederiz");
	}

	@Override
	public String message() {
		
		return "Kara Taşımacılığı";
	}

	@Override
	public String toString() {
		return this.message();
	}
}

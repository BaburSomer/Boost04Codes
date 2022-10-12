package com.bilgeadam.course04.lesson35.factory;

public class AirLogistic implements Logistic {

	@Override
	public void deliver(String good) {
		System.out.println("Havadan mal taşırız");
		
	}

	@Override
	public void accept(String good) {
		System.out.println("Havadan mal kabul ederiz");
	}

	@Override
	public String message() {
		
		return "Hava Taşımacılığı";
	}

	@Override
	public String toString() {
		return this.message();
	}

}

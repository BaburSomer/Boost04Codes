package com.bilgeadam.course04.lesson35.factory;

public class SeaLogistic implements Logistic {

	@Override
	public void deliver(String good) {
		System.out.println("Denizaşırı mal taşırız");
		
	}

	@Override
	public void accept(String good) {
		System.out.println("Denizaşırı mal kabul ederiz");
	}

	@Override
	public String message() {
		
		return "Deniz Taşımacılığı";
	}

	@Override
	public String toString() {
		return this.message();
	}

}

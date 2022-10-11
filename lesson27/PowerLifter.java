package com.bilgeadam.course04.lesson27;

public class PowerLifter extends Sportsmen {
	private int maxWeight;

	public PowerLifter(String name, boolean healty, int maxWeight) {
		super(name, healty);
		this.maxWeight = maxWeight;
	}

	public int getMaxWeight() {
		return maxWeight;
	}

	public void setMaxWeight(int maxWeight) {
		this.maxWeight = maxWeight;
	}

}

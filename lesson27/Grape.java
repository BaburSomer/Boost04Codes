package com.bilgeadam.course04.lesson27;

public class Grape extends Fruit{

	@Override
	boolean isSeedy() {
		return true;
	}
	
	public boolean isSuitableForWaterExtraction () {
		return true;
	}
}

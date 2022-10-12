package com.bilgeadam.course04.lesson35.builder;

public class BuilderpatternTest {

	public static void main(String[] args) {
		HouseBuilderPattern house = new HouseBuilderPattern.HouseBuilder("Taksim", "İstanbul", 100)
									.kitchenType(KitchenType.AMERICAN)
									.apartment(false)
									.numOfrooms(5)
									.build();
		System.out.println(house);
		
		house = new HouseBuilderPattern.HouseBuilder("Taksim", "İstanbul", 1100)
				.kitchenType(KitchenType.OPEN)
				.apartment(true)
				.numOfStoreys(5)
				.terrace(true)
				.usableSpace(100)
				.build();
		System.out.println(house);
	}
}

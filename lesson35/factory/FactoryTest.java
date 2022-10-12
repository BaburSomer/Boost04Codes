package com.bilgeadam.course04.lesson35.factory;

public class FactoryTest {

	public static void main(String[] args) {
		LandLogistic land = new LandLogistic();
		land.accept("Fasülye");
		System.out.println(land);
		
		AirLogistic air = new AirLogistic();
		System.out.println(air);
		
		
		Logistic l1 = LogisticsFactory.create("kara");
		System.out.println(l1);
		Logistic l2 = LogisticsFactory.create("deniz");
		System.out.println(l2);
		Logistic l3 = LogisticsFactory.create("hava");
		System.out.println(l3);
		
		
		String[] types = {"kara", "kara", "deniz", "hava", "hava", "kara", "kara", "deniz", "hava", "hava"};
		
		Logistic l;
		for (String type : types) {
			if (type.equalsIgnoreCase("kara")) {
				l = new LandLogistic();
			}
			else if (type.equalsIgnoreCase("deniz")) {
				l = new SeaLogistic();
			}
			else {
				l = new AirLogistic();
			}
			System.out.println(l);
		}
		
		
		for (String type : types) {
			l = LogisticsFactory.create(type);
			System.out.println(l);
		}
	}
}

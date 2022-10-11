package com.bilgeadam.course04.lesson09;

public class IfTest {

	public static void main(String[] args) {
		double salesTotal = 123.45;
		double commission = 0;

		double commisionRate = 0.0;
		
		if (salesTotal > 100) {
			commisionRate = 0.5;
			commission = salesTotal * commisionRate;
		}
		
		System.out.println("Alınan komisyon : " + commission);
		

		if (salesTotal > 200) {
			commisionRate = 0.3;
			commission = salesTotal * commisionRate;
		}
		else {
			commisionRate = 0.2;
			commission = salesTotal * commisionRate;
		}
		
		System.out.println("Alınan komisyon : " + commission);
	}

}

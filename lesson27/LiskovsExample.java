package com.bilgeadam.course04.lesson27;

public class LiskovsExample {

	public static void main(String[] args) {
		Runner r1 = new Runner("Koşucu", true, 100);
		PowerLifter p1 = new PowerLifter("Halterci", true, 120);
		
		Sportsmen s1 = new Runner("Koşucu 2", true, 42240);  // Liskov's Substitution Principle
		s1 = p1;
		

	}

}

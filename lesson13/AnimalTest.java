package com.bilgeadam.course04.lesson13;

import com.bilgeadam.course04.lesson13.model.Animal;

public class AnimalTest {

	public static void main(String[] args) {	
		
		int i = 5;  // local / yerel değişken
		i++;
		System.out.println("i'nin değeri: " + i);
		
		System.out.println(i + " ile 5'in toplamı " + addNumbers(i, 5));
		
		Animal cat1 = new Animal();
		cat1.setName("Sarman");
		cat1.setSpecies("Kedi");
		
		Animal cat2 = new Animal();
		cat2.setName("Pisipisi");
		cat2.setSpecies("Kedi");
		Animal dog1 = new Animal();
		dog1.setName("Bobby");
		dog1.setSpecies("Köpek");

		System.out.println(cat1);
		System.out.println(cat2);
		System.out.println(dog1);
		
		System.out.println("Evdeki tüm hayvanların sayısı: " + Animal.getNumberOfAnimals());
		System.out.println("Evdeki tüm kedilerin sayısı  : " + Animal.getNumberOfCats());
		System.out.println("Evdeki tüm köpeklerin sayısı : " + Animal.getNumberOfDogs());
		
		
		
		
	}
	
	
	private static int addNumbers(int a, int b) {
		int sum = a + b;
		return sum;
	}
}

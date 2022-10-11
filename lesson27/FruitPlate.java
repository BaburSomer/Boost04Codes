package com.bilgeadam.course04.lesson27;

import java.util.ArrayList;
import java.util.List;

public class FruitPlate {
	private static List<Fruit> plate;

	/*
	 * 
	 * Tabağa yeni bir tür meyva eklesen tabakta bir değişiklik olmayacak. 
	 * Dependency Inversion Principle. Tabağa eklenebilecekler,i ya abstract sınıflar ya da 
	 * Interface'ler üzerinden tanımlıyoruz.
	 * 
	 */
	public static void main(String[] args) {
		plate = new ArrayList<>();
		plate.add(new Grape());
		plate.add(new Sultaniye());
		plate.add(new Watermelon());
	}

}

package com.bilgeadam.course04.lesson21;

public class CompareToExample {

	public static void main(String[] args) {
		// Doğal sıralama karşılaştırılması
		
		Integer i1 = 5;
		int i2 = 25;
		System.out.println(i1.compareTo(i2));
		
		int i3 = 123;
		System.out.println(Integer.compare(i2, i3));
		
		// aynı şekilde wrapper sınıfları kullanarak tüm primitif veri tipleri
		// veya Tarih ve Zaman nesneleri için de doğal sıralama kullanılır
	}

}

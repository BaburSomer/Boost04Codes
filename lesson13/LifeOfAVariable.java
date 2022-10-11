package com.bilgeadam.course04.lesson13;

public class LifeOfAVariable {
	private String str;  // nesne değişkeni: ancak LifeOfAVariable sınıfından new ile bir nesne üretilirse bu özniteliğe erişilebilir
	private static String anotherString; // sınıf değişkeni. Sınıf içindeki tüm static ve non-static metot ve yerlerden erişilebilir

	
	public static void main(String[] args) {
//		str = "Hello";  ==> HATA! önce nesne üretmek gerekli
				
		LifeOfAVariable.anotherString = "Hello";
	}

	private void aMethod() {
		str = "Hello";
		this.str = "Yeniden Hello";
		anotherString = "Hello";
		LifeOfAVariable.anotherString  = "Yine Hello";  // sınıf değişkenleri this'in kullanıldığı şekilde sınıf adı ile kullanılabilir
		this.anotherString = ""; // böyle kullanmak hata değil ama önerilmez.
	}
}

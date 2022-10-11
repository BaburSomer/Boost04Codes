package com.bilgeadam.course04.lesson08;

public class OperatorPrecedenceTest {

	public static void main(String[] args) {
		int a = 20;
		int b = 4;
		System.out.println("c = a++ * b - Sonuç:" + a++ * b + " [a=" + a + " b=" + b + "]");
		System.out.println("c = ++a * b - Sonuç:" + ++a * b + " [a=" + a + " b=" + b + "]");
		System.out.println("c = --a * b - Sonuç:" + --a * b + " [a=" + a + " b=" + b + "]");
		System.out.println("c = a-- * b - Sonuç:" + a-- * b + " [a=" + a + " b=" + b + "]");
		
//		System.out.println(++a--);	==> hata verir
		
		System.out.println("c = a-- / b - Bölmenin Sonucu:" + a-- / b + "  [a=" + a + " b=" + b + "]");
		System.out.println("c = ++a / b - Bölmenin Kalanı:" + ++a % b + "  [a=" + a + " b=" + b + "]");
		
		
		System.out.println("Ali \"Baba\"");
		System.out.println("Ali\bBaba");
		System.out.println("Ali\tBaba");
		System.out.println("Ali\t\tBaba");
		System.out.println("Ali\nBaba");
		
		long l = 12_345_678_900_000L;
		
	}
}

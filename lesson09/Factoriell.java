package com.bilgeadam.course04.lesson09;

import java.util.Scanner;

public class Factoriell {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int number = 0;
		double factoriell;  // büyük sayılarla çalışmak için double kullandık. yaosa tam sayı türlerinden int veya long kullanmak gerekirdi
		
		while (true) {
			System.out.print("Lütfen 50'ten küçük ve 99 farklı bir sayı giriniz: ");
			number = scanner.nextInt();
			if (number == 99) {
				break;
			}
			if (number < 1 || number > 50) {
				System.err.println("Hatalı sayı girdiniz!");
				continue;
			}
			factoriell = 1;
			for (int i = 1; i <= number; i++) {
				factoriell *= i;
			}
			System.out.println(number + "'ın faktorieli " + factoriell + " dir." );
		}
		
		scanner.close();
		System.out.println("bye....");
		
		boolean cont = true;
		for (int num = 1;num < Integer.MAX_VALUE; num++) {
			double factor = 1;
			for (int i = 1; i <= num; i++) {
				factor *= i;
				if (factor >= Double.MAX_VALUE) {
					cont = false;
					break;
				}
			}
			if (cont) 
				System.out.println(num + "'ın faktorieli " + factor + " dir." );
			else {
				System.out.println("Sınıra ulaştık");
				break;
			}
		}
	}

}

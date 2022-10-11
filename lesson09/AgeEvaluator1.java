package com.bilgeadam.course04.lesson09;

import java.util.Scanner;

public class AgeEvaluator1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Lütfen yaş bilgisi giriniz: ");
		int age = sc.nextInt();
		
		if (age < 18) {
			System.out.println("Çocuk");
		}
		if (age >= 18 && age < 30) {
			System.out.println("Genç");
		}
		if (age >= 30 && age < 50) {
			System.out.println("Orta yaşlı");
		}
		else {
//		if (age >= 50) { else ile aynı anlama geliyor
			System.out.println("Yaşlı");
		}
		
		
		sc.close();
	}

}

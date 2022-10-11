package com.bilgeadam.course04.lesson09;

import java.util.Scanner;

public class AgeEvaluator3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Lütfen yaş bilgisi giriniz: ");
		int age = sc.nextInt();

		if (age < 18) {
			System.out.println("Çocuk");
		} 
		else if (age >= 18 && age < 30) {
			System.out.println("Genç");
		} 
		else if (age >= 30 && age < 50) {
			System.out.println("Orta yaşlı");
		} 
		else {
			System.out.println("Yaşlı");
		}

		sc.close();
	}

}

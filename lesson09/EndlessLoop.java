package com.bilgeadam.course04.lesson09;

import java.util.Scanner;

public class EndlessLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = 0;
		int i = 0;
		while (++i <= 10) {
			System.out.print("Lütfen 99 harici bir sayı giriniz: ");
			input = sc.nextInt();
			if (input == 99) {
				System.out.println("Keşke başka bir sayı girseydiniz");
				break;
			}
			System.out.println(i + ". girdiğiniz sayı: " + input);
		}
		System.out.println("bye ...");
		sc.close();
	}
}

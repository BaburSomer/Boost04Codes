package com.bilgeadam.course04.lesson13;

import java.util.Scanner;

public class UserInputTest {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Lütfen bir sayı giriniz: ");
		int input = scn.nextInt();
		System.out.println("Girilen sayı: " + input);
		scn.close();
	}
}

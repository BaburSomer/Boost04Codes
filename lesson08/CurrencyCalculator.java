package com.bilgeadam.course04.lesson08;

import java.util.Scanner;

/**
 * 
 * @author babur.somer
 * Java Doc
 *
 */
public class CurrencyCalculator {
	
	/**
	 * 
	 * @param args 
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Günlük Dolar kurunu griniz: ");
		double rate = input.nextDouble();
		System.out.print("Bozdurmak istediğiniz meblağı giriniz: ");
		int amount = input.nextInt();
		System.out.println("Dolar kuru: " + rate + " bozdurulacak meblağ: " + amount);
		
		/*
		 * c-like veya block comment 
		 * dfdsf
		 * fdsfds
		 * fdsfds
		 * fds
		 */
		System.out.println(amount + "$ ==> " + amount*rate + "TL eder"); // inline comment
		System.out.println(amount + "TL ==> " + amount/rate + "$ eder");
		
		input.close();
		
		{
			int a, b/*, notNeeded*/;
			b=0;
			a = b;
		}
		{
			// boş blok
		}
	}
}

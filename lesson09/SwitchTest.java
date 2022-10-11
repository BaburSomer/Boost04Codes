package com.bilgeadam.course04.lesson09;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Lütfen bir not bilgisi giriniz: ");
		int score = sc.nextInt();

		if (score < 59) {
			System.out.println("F");
		} 
		else if (score >= 90) {
			System.out.println("A");
		} 
		else if (score >= 80 && score < 90) {
			System.out.println("B");
		} 
		else if (score >= 70 && score < 80) {
			System.out.println("C");
		} 
		else if (score >= 60 && score < 70) {
			System.out.println("D");
		} 
		else {
			System.out.println("Geçersiz not");
		}

		sc.close();
		
		int grade = score / 10;   // ==> 0 ila 10 arası bir değer 

		/*
		 * JAVA 13 öncesi switch kullanımı
		 */
		switch (grade) {
		case 10: 
		case 9:
			System.out.println("Switch: A");
			break;
		case 8:
			System.out.println("Switch: B");
			break;
		case 7:
			System.out.println("Switch: C");
			break;
		case 6:
			System.out.println("Switch: D");
			break;
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
		case 0:
			System.out.println("Switch: F");
			break;
		default:
			System.out.println("Switch: Geçersiz not");
		}
		
		String msg = switch (grade) {
		case 10, 9: {
			yield "JAVA 13: A";
		}
		case 8: {
			yield "JAVA 13: B";
		}
		case 7: {
			yield "JAVA 13: C";
		}
		case 6: {
			yield "JAVA 13: D";
		}
		case 5, 4, 3, 2, 1, 0: {
			yield "JAVA 13: F";
		}
		default:
			yield "JAVA 13: Geçersiz not";
		};
		System.out.println(msg);
	}

}

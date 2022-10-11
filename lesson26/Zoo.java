package com.bilgeadam.course04.lesson26;

import java.util.Scanner;

public class Zoo {

	public static void main(String[] args) {
//		if (args.length == 1) {
//			Properties.init(args[0]);
//		}
//		else {
//			System.err.println("Yanlış program argüman sayısı. Beklenen <<< 1 >>> Girilen <<< " + args.length + " >>>");
//			System.exit(100);
//			
//			/*
//			 * Programı bitirmek yerine belirli bir varsayılan değerle çalışacağı knusunda kullanıcı bilgilendrilir
//			 * System.out.println("Yanlış program argüman sayısı. Beklenen <<< 1 >>> Girilen <<< " + args.length + " >>>. Program \"Türkçe\" devam edecek");
//			 * Properties.init("tr");
//			 */
//		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print(Properties.getString("Zoo.INPUT")); 
		String animalName = sc.nextLine();
		ANIMAL animal = ANIMAL.getAnimalByName(animalName);
		System.out.println(Properties.getString("Zoo.OUTPUT") + " " + animal.getName() + " " + animal.giveSound()); 
		sc.close();
		
		
	}

}

package com.bilgeadam.course04.lesson12;

import java.util.Scanner;

public class House {

	public static void main(String[] args) {
		int numOfStoreys = askForNumberOfFloors();
		buildHouse(numOfStoreys);
		
		buildHouse(2);
		buildHouse(1);
	}
	
	public static void buildHouse() {
		roof();
		
		for (int i = 0; i < askForNumberOfFloors(); i++) {
			floor();
		}
	}

	public static void buildHouse(int numberOfFloors) {
		roof();
		
		for (int i = 0; i < numberOfFloors; i++) {
			floor();
		}
	}
	
	private static int askForNumberOfFloors() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Kaç katlı bir bina istersiniz? ");
		int numOfFloors = scanner.nextInt();
		scanner.close();
		return numOfFloors;
	}

	private static void roof() {
		System.out.println("     /\\");
		System.out.println("    /  \\");
		System.out.println("   /    \\");
		System.out.println("  /      \\");
		System.out.println(" /        \\");
		System.out.println("/          \\");
		System.out.println("+==========+");
	}

	private static void floor () {
		System.out.println("|          |");
		System.out.println("|          |");
		System.out.println("|          |");
		System.out.println("|          |");
		System.out.println("|          |");
		System.out.println("+==========+");
	}
}

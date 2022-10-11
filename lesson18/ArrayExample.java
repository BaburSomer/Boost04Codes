package com.bilgeadam.course04.lesson18;

import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
		System.out.println("Oyunda kaç oyuncu olacak? ");
		Scanner in = new Scanner(System.in);
		int numOfPlayers = in.nextInt();
		in.nextLine();
		
		String[] players = new String[numOfPlayers];
		
		for (int i=0; i < numOfPlayers; i++) {
			System.out.println((i+1) + ". Oyuncu adını giriniz:");
			players[i] = in.nextLine();
		}
		
		in.close();
		
		System.out.println("\nOyuncu Listesi");
		System.out.println("==============");
		for (int i=0; i<players.length; i++) {
			System.out.println((i+1) + ". Oyuncu: " + players[i]);
		}
		
		for (String player : players) {
			System.out.println(player);
		}
	}

}

package com.bilgeadam.course04.lesson18;

public class BoredMan {

	public static void main(String[] args) {

		boolean[] spints = new boolean[10];

		for (int tour = 1; tour <= spints.length; tour++) {
			for (int i = 0; i < spints.length;i++) {
				spints[i] = !spints[i];
				i += tour;
			}
		}
		
		for (boolean b : spints) {
			System.out.println(b);
		}
	}

}

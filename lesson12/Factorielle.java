package com.bilgeadam.course04.lesson12;

public class Factorielle {

	public static void main(String[] args) {
		System.out.println(factorielle(5));
	}

	private static long factorielle(int n) {
		if (n == 0 || n == 1) 
			return 1;

		return n * factorielle(n-1);
	}

}

package com.bilgeadam.course04.lesson12;

public class Calculator {
	public static void main(String[] args) {
		System.out.println(add(3, 5));
		System.out.println(add(4, 6));
		System.out.println(add(add(3, 5), add(4, 6)));
		System.out.println(add(add(4, 6), 5));
		
		System.out.println(devide(2,  5d));
		System.out.println(devide(5.3, 2));
		System.out.println(devide(5, 2, 5));
		System.out.println(multiply(3, 8));
		System.out.println(quadrat(22));
		System.out.println(multiply(22, 22));
		
		int a = 10;
		System.out.println(quadrat(a));
		a = quadrat(a);
		System.out.println(a);
//		House.buildHouse();
	}
	
	private static int add (int a, int b) {
		return a + b;
	}
	
	private static double devide(int a, double b) {
		return b / a;
	}
	
	private static double devide(int a, double b, double c) {
		return (b+c) / a;
	}
	
	private static double devide(double a, int b) {
		return b / a;
	}
	
	private static int multiply(int a, int b) {
		return a * b;
	}
	
	private static int quadrat (int a) {
		return multiply(a, a);
	}
}

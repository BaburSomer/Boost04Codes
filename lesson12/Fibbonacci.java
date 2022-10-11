package com.bilgeadam.course04.lesson12;

public class Fibbonacci {

	public static void main(String[] args) {
		int n = 50;
		long start = System.nanoTime();
		long fibo = normalCalculation(n);
		long stop = System.nanoTime();
		System.out.println("1. yöntem: " + fibo + "in " + (stop-start) + " nanos");
		
		start =System.nanoTime();
		fibo = recursiveCalculation(n);
		stop = System.nanoTime();
		System.out.println("2. yöntem: " + fibo + "in " + (stop-start) + " nanos");
		
		start = System.nanoTime();
		fibo = explicitCalculation(n);
		stop = System.nanoTime();
		System.out.println("3. yöntem: " + fibo + "in " + (stop-start) + " nanos");
		
	}

	private static long explicitCalculation(int n) {
		double sqrt5 = Math.sqrt(5);
		return (long) (1/sqrt5 * ((Math.pow(((1 + sqrt5)/2), n) - Math.pow(((1 - sqrt5)/2), n))));
	}

	private static long recursiveCalculation(int n) {
		if (n == 1 || n == 2)
			return 1;
		return recursiveCalculation(n-1) + recursiveCalculation(n-2);
	}

	private static long normalCalculation(int n) {
		long n1 = 0;
		long n2 = 1;
		long nth= 0;
		for (int i = 1; i < n; i++) {
			nth = n1 + n2;
			n1 = n2;
			n2 = nth;
		}
		return nth;
	}
}

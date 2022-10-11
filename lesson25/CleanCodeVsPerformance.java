package com.bilgeadam.course04.lesson25;

public class CleanCodeVsPerformance {
	private static final int age = 25;

	public static void main(String[] args) {
		long  start, stop;
		int[] loopCounts = { 10, 100, 1_000, 10_000, 100_000, 1_000_000, 100_000_000 };
		for (int i = 0; i < loopCounts.length; i++) {
			start = System.nanoTime();
			performanceTest(loopCounts[i]);
			stop = System.nanoTime();
			System.out.println(
					loopCounts[i] + " sorgu ile Performans Odaklı method " + (stop - start) + " nanosaniyede çalıştı");
			start = System.nanoTime();
			cleanCodeTest(loopCounts[i]);
			stop = System.nanoTime();
			System.out.println(
					loopCounts[i] + " sorgu ile CleanCode Odaklı method  " + (stop - start) + " nanosaniyede çalıştı");
		}
	}

	private static void cleanCodeTest(int i) {
		if (hasValidAge()) {
			doSomething();
		}

	}

	private static boolean hasValidAge() {
		return age >= 18 && age <= 100;
	}

	private static void performanceTest(int i) {
		if (age >= 18 && age <= 100) {
			doSomething();
		}
	}

	private static void doSomething() {
		// does nothing
	}
}

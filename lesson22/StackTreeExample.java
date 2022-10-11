package com.bilgeadam.course04.lesson22;

public class StackTreeExample {

	public static void main(String[] args) {
		methodA();
		System.out.println("Main method ended");
	}

	private static void methodA() {
		methodB();
		System.out.println("Method A ended");
	}

	private static void methodB() {
		methodC();
		System.out.println("Method B ended");
	}

	private static void methodC() {
		System.out.println(3 / 0);
		System.out.println("Method C ended");
	}

}

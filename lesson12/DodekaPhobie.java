package com.bilgeadam.course04.lesson12;

public class DodekaPhobie {

	public static void main(String[] args) {
		System.out.println("Çekilen numara: " + randomNumber(35, 14));
		System.out.println("Çekilen numara: " + randomNumber());
	}

	private static int randomNumber() {
		return randomNumber(20, 12);
	}

	private static int randomNumber(int upperBound, int phobieNumber) {
		int returnValue = 0;

		double rndm;
		do {
			rndm = Math.random();
			returnValue = (int) (rndm * upperBound) + 1;
		} while (returnValue == phobieNumber);

		return returnValue;
	}
}

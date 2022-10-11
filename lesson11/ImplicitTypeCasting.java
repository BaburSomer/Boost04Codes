package com.bilgeadam.course04.lesson11;

public class ImplicitTypeCasting {

	public static void main(String[] args) {
		int lowerType = 34567;
		long higherType = lowerType;
		double anotherHigherType = lowerType;
		
		System.out.println("Küçük tür: " + lowerType);
		System.out.println("Büyük tür: " + higherType);
		System.out.println("Büyük tür: " + anotherHigherType);

	}

}

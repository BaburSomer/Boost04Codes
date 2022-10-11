package com.bilgeadam.course04.lesson11;

public class ExplicitTypeCasting {

	public static void main(String[] args) {
		long higherType = 234_234_234_234_234L;
		int lowerType = (int)higherType;
		
		System.out.println("Küçük tür: " + lowerType);
		System.out.println("Büyük tür: " + higherType);
		
		double anotherHigherType = 123.67;
		higherType = (long)anotherHigherType;
		System.out.println("Büyük tür: " + higherType);
		
		double x = 1.0 / 3.0;
		System.out.println(x);
		
		float y = (float)x;
		System.out.println(y);
	}

}

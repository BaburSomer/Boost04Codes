package com.bilgeadam.course04.lesson07;

public class MathematicalOperatorTest {
	public static void main(String[] args) {
		System.out.println(7 / 5);
		System.out.println(5 / 7);
		int num1 = 7;
		int num2 = 5;
		System.out.println(num1 / num2);
		System.out.println(num1 % num2);

		double num3 = 23.5;
		double num4 = 56.98;

		System.out.println(num3 / num4);

		System.out.println(num1 / num3);
		System.out.println(num4 / num2);

		System.out.println(4 + 5 * 8);
		System.out.println((4 + 5) * 8);
		
		
		num1 = num1 + 5;
		System.out.println(num1);
		num1 = num1 + 18;
		System.out.println(num1);
		
		num1 += 43;
		System.out.println(num1);
		num1 /= 20;					// ==> num1 = num1 / 20
		System.out.println(num1);
		
		System.out.println(num1++);  //==> 3
		System.out.println(num1);
		System.out.println(++num1);  // ==> 5
	}
}

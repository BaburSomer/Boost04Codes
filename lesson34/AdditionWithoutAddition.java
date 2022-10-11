package com.bilgeadam.course04.lesson34;

import java.util.ArrayList;
import java.util.List;

public class AdditionWithoutAddition {

	public static void main(String[] args) {
		int a = -10, b = -15;
		System.out.println(AdditionWithoutAddition.add(a, b));
		System.out.println(AdditionWithoutAddition.alternateAdd(a, b));

	}

	private static int alternateAdd(int a, int b) {
		if (a == 0) {
			return b;
		}
		if (b == 0) {
			return a;
		}
		
		List<Integer> sum = new ArrayList<>();
		
		if (a > 0) {
			for (int i = 0; i < a; i++) {
				sum.add(1);
			}
		}
		if (b > 0) {
			for (int i = 0; i < b; i++) {
				sum.add(1);
			}
		}

	   return sum.size();
	}

	private static int add(int a, int b) {
		if (a == 0) {
			return b;
		}
		if (b == 0) {
			return a;
		}

		if (a > 0) {
			a = -a;
		}

		if (b > 0) {
			for (int i = b; i > 0; i--) {
				a -= 1;
			}
		}
		else {  // hem a hem b eksi
			a = -a;
			b = -b;
			for (int i = b; i > 0; i--) {
				a -= 1;
			}
		}
		
		if (a < 0)
			return a;
					
		return -a;
	}
}

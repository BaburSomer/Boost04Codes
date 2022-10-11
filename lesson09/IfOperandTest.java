package com.bilgeadam.course04.lesson09;

public class IfOperandTest {

	public static void main(String[] args) {
		int x = 50;
		int y = 43;
		
		if (x > y) {
			System.out.println(" x , y'den büyüktür");
		}
		else {
			System.out.println(" y , x'ten büyüktür");
		}

		String msg = x > y ? " x , y'den büyüktür" : " y , x'ten büyüktür";
		System.out.println(msg);
	}
}

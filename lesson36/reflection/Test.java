package com.bilgeadam.course04.lesson36.reflection;

public class Test {

	public static void main(String[] args) {
		ReflectedClass ref = new ReflectedClass("Babür", "Somer", 1324, false);
		System.out.println(ref.actualAge());
		System.out.println(ref);
	}
}

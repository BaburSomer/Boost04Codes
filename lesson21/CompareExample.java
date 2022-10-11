package com.bilgeadam.course04.lesson21;

public class CompareExample {

	public static void main(String[] args) {
		String s1 = "Mutlu";
		String s2 = "Yazıl";
		String s3 = "Matlu";
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.compareTo(s1));

		System.out.println(s1.compareTo(s3));
	}

}

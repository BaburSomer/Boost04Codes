package com.bilgeadam.course04.lesson09;

public class ForLoop {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			System.out.println(i + ". defa Merhaba Dünya");
		}

		int i = 1;
		for (; i <= 10;i++) {
			System.out.println(i + ". defa Merhaba Dünya");
		}

		i = 1;
		for (; i <= 10;) {
			System.out.println(i + ". defa Merhaba Dünya");
			i++;
		}

		i = 1;
		for (;;) {
			System.out.println(i + ". defa Merhaba Dünya");
			i++;
			if (i > 10) {
				break;
			}
		}
		
	}
}

package com.bilgeadam.course04.lesson12;

public class RecursiveHelloWorld {

	public static void main(String[] args) {
		hello4Ever(0);
	}

	private static void hello4Ever(int counter) {
		counter++;
		System.out.println(counter + ". defa merhaba dünya");
		if (counter == 400)
			return;
		 
		hello4Ever(counter);
	}

}

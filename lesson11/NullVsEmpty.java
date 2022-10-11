package com.bilgeadam.course04.lesson11;

import javax.swing.JOptionPane;

public class NullVsEmpty {

	public static void main(String[] args) {
		MyClass myVariable = null;
		System.out.println(myVariable);
//		System.out.println(myVariable.a); ==> NullPointerException == program buarad varolmayan bir nesnenin bir özniteliğine erişmeye çalışıyor. O yüzden de çöküyor
		myVariable = new MyClass();
		System.out.println(myVariable.a);
		System.out.println(myVariable);
		
		
		String input = JOptionPane.showInputDialog("Bir değer giriniz: ");
		
		if (input != null && !input.isEmpty()) {
			System.out.println(input);
		}
		
		if (input == null) {
			System.out.println("nesne oluşturulmamış");
		}
		else if (input.isEmpty()) {
			System.out.println("boş");
		} else if (input.isBlank()) {
			System.out.println("space karakterleri girilmiş");
		}
		else {
			System.out.println(input);
		}
		System.out.println("----");
	}

}

package com.bilgeadam.course04.lesson19;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("Elma");
		list.add("1");
		list.add("true");
		list.add("Armut");
		
		if (list.contains("Koltuk"))
			System.out.println("Listede koltuk var");
		else
			System.out.println("Listede koltuk yok");
		
		for (String string : list) {
			System.out.println(string);
		}
		
		list.add(2, "Üzüm");
		list.add(5, "Üzüm");
		for (int i=0; i < list.size(); i++) { // array.length
			System.out.println(list.get(i));  // array[i]
		}
		
	}

}

package com.bilgeadam.course04.lesson21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		List<Integer> ints = Arrays.asList(3, 5, 7, 9, 24, 65, 54, 765, 76, 532, 323, 1, 3, 4, 5, 7, 88);

		// listenin tüm öğelerinin karesini al
		System.out.println("\n-----------------------");
		ints.stream().map(i -> i * i).forEach(s -> System.out.println(s)); // collection'lardaki map değil. bir değeri
																			// başka bir değer ile eşleştirme

		System.out.println("\n-----------------------");
		for (Integer integer : ints) {
			int square = integer * integer;
			System.out.println(square);
		}

		// listenin 9'dan büyük öğelerinin karesini al
		System.out.println("\n-----------------------");
		ints.stream().filter(x -> x > 9).map(i -> i * i).forEach(s -> System.out.println(s)); // collection'lardaki map
																								// değil. bir değeri
		System.out.println("\n-----------------------");
		for (Integer integer : ints) {
			if (integer > 9) {
				int square = integer * integer;
				System.out.println(square);
			}
		}

		
		// listenin 9'dan büyük öğelerinin karelerini al ve 8000'den küçükleri ekrana yaz
		System.out.println("\n-----------------------XXXX");
		ints.stream().filter(x -> (x > 9 && x < 765))
					 .map(i -> i * i)
					 .filter(i -> i <= 8000)
//					 .forEach(s -> System.out.println(s)); 
					 .forEach(System.out::println);

		System.out.println("\n-----------------------");
		List<Integer> squares = new ArrayList<>();
		for (Integer integer : ints) {
			if (integer > 9 && integer < 765) {
				int square = integer * integer;
				squares.add(square);
			}
		}
		for (Integer square : squares) {
			if (square <= 8000) {
				System.out.println(square);
			}
		}
		
		ints.stream().reduce((x, y) -> x + y).stream().forEach(s -> System.out.println(s));

		List<String> list1 = Arrays.asList("Bira", "güna", "okula", "giderkena");
		List<String> list2 = Arrays.asList("herşeye", "dikkat", "ederken");
		
//		Stream<String> words.collect( () -> new ArrayList<>(), (list, s) -> list.add(s), (list1, list2) -> list1.addAll(list2)); 
		
		System.out.println(list1.stream().anyMatch(s -> s.contains("e"))); // OR
		System.out.println(list1.stream().allMatch(s -> s.contains("a"))); // AND
	}
}

package com.bilgeadam.course04.lesson21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamVsParallelStreamExample {

	public static void main(String[] args) {
		List<String> strings = new ArrayList<>();
		// String arraylistesine öğe eklemenin bir yolu
		strings.add("Customer 1");
		strings.add("Customer 2");
		strings.add("Customer 3");
		
		// Bir başka yol ise sanki array tanımlar gibi
		strings = Arrays.asList("Student 1", "Student 2", "Student 3", "Student 4", "Student 5", "Student 6", "Student 7");
		
		// Normal for döngüsü kullanarak liste öğelerini ekranma yazdırmak için
		System.out.println("Normal FOR Döngüsü");
		for (String s : strings) {
			System.out.println(s);
		}
		System.out.println("-------------------------\n");
		// Stream'lerin akışını kullanarak liste öğelerini ekranma yazdırmak için
		System.out.println("Klasik STREAM");
		strings.stream().forEach(s -> System.out.println("Öğrenci Listesi: " + s + " kullanılan Thread: " + Thread.currentThread()));
		
		System.out.println("-------------------------\n");
		// Stream'lerin akışını kullanarak liste öğelerini ekranma yazdırmak için
		System.out.println("Klasik PARALLEL STREAM");
		strings.parallelStream().forEach(s -> System.out.println("Öğrenci Listesi: " + s + " kullanılan Thread: " + Thread.currentThread()));
	}
}

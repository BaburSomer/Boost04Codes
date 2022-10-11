package com.bilgeadam.course04.lesson21;

import java.util.Arrays;

public class StudentCompareTest {

	public static void main(String[] args) {
		Student s1 = new Student(123456, "Babür", "Somer");
		Student s2 = new Student(345678, "Ali", "Veli");

		Student[] students = { s1, s2, new Student(86769808, "Erşan", "Kuneri"),
				new Student(989879789, "Ayşe", "Fatma") };

		Arrays.sort(students, StudentsByFirstName.BY_FIRST_NAME);
		System.out.println("İlk isme göre sıralama: " + Arrays.toString(students));
		System.out.println();

		Arrays.sort(students, new StudentsByFullName(true));
		System.out.println("Tam isme göre büyüyen şekilde sıralama: " + Arrays.toString(students));
		System.out.println();

		Arrays.sort(students, new StudentsByFullName(false));
		System.out.println("Tam isme göre küçülen şekilde sıralama: " + Arrays.toString(students));
		System.out.println();

		Arrays.sort(students, new StudentsByLengthOfLastName());
		System.out.println("Son ismin uzunluğuna göre sıralama: " + Arrays.toString(students));
		System.out.println();

		Arrays.sort(students);
		System.out.println("Doğal sıralama: " + Arrays.toString(students));
	}
}

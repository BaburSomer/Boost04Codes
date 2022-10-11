package com.bilgeadam.course04.lesson21;

import java.util.Comparator;

public class StudentsByLengthOfLastName implements Comparator<Student> {

	@Override // "Doğal sıralama dışında sıralamalar için Comparator interface'inin yöntemi
	public int compare(Student first, Student second) {
		int lengthOfFirst = first.getLastName().length();
		int lengthOfSecond = second.getLastName().length();
		return Integer.compare(lengthOfFirst, lengthOfSecond);
	}
}

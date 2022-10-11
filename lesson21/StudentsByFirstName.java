package com.bilgeadam.course04.lesson21;

import java.util.Comparator;

public class StudentsByFirstName implements Comparator<Student> {
	public static final StudentsByFirstName BY_FIRST_NAME = new StudentsByFirstName();
	
	@Override  // "Doğal sıralama dışında sıralamalar için Comparator interface'inin yöntemi
	public int compare(Student first, Student second) {
		return first.getFirstName().compareTo(second.getFirstName());
	}
}

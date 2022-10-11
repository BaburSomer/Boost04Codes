package com.bilgeadam.course04.lesson21;

import java.util.Comparator;

public class StudentsByFullName implements Comparator<Student> {
	private boolean ascending;
	
	public StudentsByFullName(boolean ascending) {
		super();
		this.ascending = ascending;
	}

	@Override  // "Doğal sıralama dışında sıralamalar için Comparator interface'inin yöntemi
	public int compare(Student first, Student second) {
		String firstFullName = first.getLastName() + " " + first.getFirstName();
		String secondFullName = second.getLastName() + " " + second.getFirstName();
		
		if (this.ascending)
			return firstFullName.compareTo(secondFullName);
		else 
			return secondFullName.compareTo(firstFullName);
	}
}

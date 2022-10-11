package com.bilgeadam.course04.lesson21;

import java.util.Comparator;

public class Student implements Comparable<Student>, Comparator<Student> {
	private long registrationNumber;
	private String firstName;
	private String lastName;

	public Student(long registrationNumber, String firstName, String lastName) {
		super();
		this.registrationNumber = registrationNumber;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	@Override // Comparable interface'inin yöntemi. "Doğal" sıralama için kullanılır.
	public int compareTo(Student otherStudent) {
		if (this.registrationNumber == otherStudent.registrationNumber) {
			return 0;
		}
		else if (this.registrationNumber < otherStudent.registrationNumber) { // kendim diğer nesneden küçüksem eksi bir değer dönmeliyim
			return -1;
		}
			
		return 1; // kendim diğer nesneden büyüksem artı bir değer dönmeliyim
		
		// şu şekilde de yazılabilirdi
//		 return Long.compare(this.registrationNumber, otherStudent.registrationNumber); // otomatik olarak Long'un karşılaştırma yöntemini kullanıyor
	}
	
	@Override  // "Doğal sıralama dışında sıralamalar için Comparator interface'inin yöntemi
	public int compare(Student first, Student second) {
		String firstFullName = first.lastName + " " + first.firstName;
		String secondFullName = second.lastName + " " + second.firstName;
		return firstFullName.compareTo(secondFullName);
	}


	public long getRegistrationNumber() {
		return registrationNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	@Override
	public String toString() {
		return "Student: " + registrationNumber + " - " + firstName + " " + lastName;
	}
}

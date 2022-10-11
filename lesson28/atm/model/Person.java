package com.bilgeadam.course04.lesson28.atm.model;

import java.io.Serializable;
import java.time.LocalDate;

public abstract class Person implements Serializable {
	private static final long serialVersionUID = 1L;
	private long              personalIdNumber;
	private String            firstName;
	private String            lastName;
	private LocalDate         birthDate;

	public Person(String firstName, String lastName, long personalIdNumber, LocalDate birthDate) {
		super();
		this.firstName        = firstName;
		this.lastName         = lastName;
		this.birthDate        = birthDate;
		this.personalIdNumber = personalIdNumber;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getPersonalIdNumber() {
		return personalIdNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	@Override
	public String toString() {
		return "Person [personalIdNumber=" + personalIdNumber + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", birthDate=" + birthDate + "]";
	}
}

package com.bilgeadam.course04.lesson36.reflection;

import java.time.LocalDate;

public class ReflectedClass {
	private String name;
	private String lastName;
	private int birthYear;
	private boolean female;

	public ReflectedClass(String name, String lastName, int birthYear, boolean female) {
		super();
		this.setName(name);
		this.setLastName(lastName);
		this.setBirthYear(birthYear);
		this.setFemale(female);
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	private void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getBirthYear() {
		return birthYear;
	}

	private void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public boolean isFemale() {
		return female;
	}

	private void setFemale(boolean female) {
		this.female = female;
	}

	@Override
	public String toString() {
		return "ReflectedClass [name=" + name + ", lastName=" + lastName + ", birthYear=" + birthYear + ", female="
				+ female + "]";
	}

	public int actualAge() {
		LocalDate actualDate = LocalDate.now();
		
		return actualDate.getYear() - this.getBirthYear();
	}
}

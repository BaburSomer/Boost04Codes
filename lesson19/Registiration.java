package com.bilgeadam.course04.lesson19;

public class Registiration {
	long registraionNumber;
	String name;
	String department;
	int year;

	public Registiration(long registraionNumber, String name, String department, int year) {
		super();
		this.registraionNumber = registraionNumber;
		this.name = name;
		this.department = department;
		this.year = year;
	}

	@Override
	public String toString() {
		return "Registiration [registraionNumber=" + registraionNumber + ", name=" + name + ", department=" + department
				+ ", year=" + year + "]";
	}
}

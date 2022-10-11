package com.bilgeadam.course04.lesson17.model;

public class Employee extends Person{
	// ÇLŞ-001, ÇLŞ-002
	private static int numOfEmployees = 0;
	
	public Employee(String firstName, String lastName) {
		super(firstName, lastName);
	}

	@Override
	public String generateId() {
		String custId = "ÇLŞ-";
		custId = String.format("%s%03d", custId, ++Employee.numOfEmployees); // https://www.javatpoint.com/java-string-format
		return custId;
	}

}

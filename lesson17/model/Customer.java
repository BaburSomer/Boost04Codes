package com.bilgeadam.course04.lesson17.model;

public class Customer extends Person{
	private static int numOfCustomers = 0;
	// MÜŞ-0001, MÜŞ-0002
	public Customer(String firstName, String lastName) {
		super(firstName, lastName);
	}

	@Override
	public String generateId() {
		String custId = "MÜŞ-";
		Customer.numOfCustomers++;
		custId = String.format("%s%04d", custId, Customer.numOfCustomers); // https://www.javatpoint.com/java-string-format
		return custId;
	}
	
	public String getFullName() {
		return this.getFirstName() + " " + this.getLastName();
	}
}

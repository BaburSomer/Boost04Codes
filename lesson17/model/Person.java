package com.bilgeadam.course04.lesson17.model;

public abstract class Person {
	private String id;
	private String firstName;
	private String lastName;
	
	public Person(String firstName, String lastName) {
		super();
		this.id = this.generateId();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public abstract String generateId();
	
	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}

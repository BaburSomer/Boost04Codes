package com.bilgeadam.course04.lesson23.serialization;

import java.io.Serializable;
import java.util.Arrays;

public class Person implements Serializable {
	
	private static final long serialVersionUID = -4725144892675722563L;
	
	private String name;
	private int birthDate;
	private Address[] addresses;
	private int addressNumber;

	public Person(String name, int birthDate, int numOfAddresses) {
		super();
		this.name = name;
		this.birthDate = birthDate;
		this.addresses = new Address[numOfAddresses];
		this.addressNumber = 0;
	}

	public String getName() {
		return name;
	}

	public int getBirthDate() {
		return birthDate;
	}

	public Address[] getAddresses() {
		return addresses;
	}
	
	public void addAddress(Address address) {
		this.addresses[this.addressNumber++] = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", birthDate=" + birthDate + ", addresses=" + Arrays.toString(addresses) + "]";
	}
}

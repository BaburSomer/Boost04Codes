package com.bilgeadam.course04.lesson23.serialization;

import java.io.Serializable;

public class Address implements Serializable {
	private static final long serialVersionUID = 1L;
	private String country;
	private String city;
	private int zip;
	private String street;
	public Address(String country, String city, int zip, String street) {
		super();
		this.country = country;
		this.city = city;
		this.zip = zip;
		this.street = street;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	@Override
	public String toString() {
		return "Address [country=" + country + ", city=" + city + ", zip=" + zip + ", street=" + street + "]";
	}
}

package com.bilgeadam.course04.lesson13.model;

public class Person {
	public String firstName; // umuma açık
	String lastName;  		// default veya paket görünürlük
	private int age;		// özel
	private String password;
	private boolean woman;

	
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.firstName = "Ali";
		p1.lastName = "Veli";
		p1.age = 4950;
	}
	
	private void aPrivateFunction() {
		System.out.println("Beni mi çağırdınız?");
	}
	
	public void initialPassword(String initialPassword) {
		this.password = initialPassword;
	}
	
	public boolean setPassword(String oldPassword, String password) {
		if (isPasswordCorrect(oldPassword)) {
			this.password = password;
			return true;
		}
		this.aPrivateFunction();
		return false;
	}
	
	public boolean isPasswordCorrect(String password) {
		return password.equals(this.password);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isWoman() {
		return woman;
	}

	public void setWoman(boolean woman) {
		this.woman = woman;
	}
	
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", password=" + password
				+ ", woman=" + woman + "]";
	}
}

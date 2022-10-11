package com.bilgeadam.course04.lesson22;

public class Person implements Comparable<Person>, Voteable {
	private String name;
	private int birthYear;
	private long idNo;
	private String address;

	public Person(String name, int birthYear, long idNo, String address) {
		super();
		this.name = name;
		this.birthYear = birthYear;
		this.idNo = idNo;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public int getBirthYear() {
		return birthYear;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", birthYear=" + birthYear + ", idNo=" + idNo + ", address=" + address + "]";
	}

	@Override
	public int compareTo(Person o) {
		return this.name.compareToIgnoreCase(o.name);
	}

	public long getIdNo() {
		return idNo;
	}

	public String getAddress() {
		return address;
	}

	@Override
	public boolean canVote() {
		return 2022 - this.birthYear >= 18;
	}

	public void giveAVote(String vote) throws CannotVoteException {
		if (this.canVote()) {
			System.out.println("Given vote : " + vote);
		}
		else {
			throw new CannotVoteException("Yaş küçüklüğünden oy veremez");
		}
	}
}

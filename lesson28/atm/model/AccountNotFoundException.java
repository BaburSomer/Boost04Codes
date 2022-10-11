package com.bilgeadam.course04.lesson28.atm.model;

public class AccountNotFoundException extends Exception {
	private static final long serialVersionUID = 25L;

	public AccountNotFoundException(String message) {
		super(message);
	}
}

package com.bilgeadam.course04.lesson28.atm.model;

public class BalanceInsufficientException extends Exception {
	private static final long serialVersionUID = 5107730721308766648L;

	public BalanceInsufficientException(String message) {
		super(message);
	}
	
}

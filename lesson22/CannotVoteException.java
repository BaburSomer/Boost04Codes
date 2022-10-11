package com.bilgeadam.course04.lesson22;

public class CannotVoteException extends Exception {
	private static final long serialVersionUID = 1L;

	public CannotVoteException(String message) {
		super(message);
	}
}

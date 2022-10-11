package com.bilgeadam.course04.lesson28.atm.model;

import java.io.Serializable;

public class Authentification implements Serializable {
	private static final long serialVersionUID = 1L;
	private String            userName;
	private String            password;
	private int               pin;

	public Authentification(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	public boolean isPasswordCorrect(String password) {
		return this.password.equals(password);
	}

	public boolean isPinCorrect(int pin) {
		return this.pin == pin;
	}

	public void setPassword(String oldPassword, String newPassword) throws AuthentificationException {
		if (this.isPasswordCorrect(oldPassword)) {
			this.password = newPassword;
		} else {
			throw new AuthentificationException(this.userName + " has chosen a wrong password");
		}
	}

	public void setPIN(int oldPIN, int newPIN) throws AuthentificationException {
		if (this.isPinCorrect(oldPIN)) {
			this.pin = newPIN;
		} else {
			throw new AuthentificationException(this.userName + " has chosen a wrong PIN");
		}
	}

	public void setInitialPIN(String password, int pin) throws AuthentificationException {
		if (this.isPasswordCorrect(password)) {
			this.pin = pin;
		} else {
			throw new AuthentificationException(this.userName + " has chosen a wrong password");
		}
	}

}

package com.bilgeadam.course04.lesson28.atm.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Currency;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class BankCustomer extends Person implements Serializable {
	private static final long        serialVersionUID = 1L;
	private int                      customerNumber;
	private Authentification         authentification;
	private Map<String, BankAccount> accounts;
	private int                      wrongPasswordCount;

	public BankCustomer(String firstName, String lastName, long personalIdNumber, LocalDate birthDate,
			int customerNumber) {
		super(firstName, lastName, personalIdNumber, birthDate);
		this.customerNumber     = customerNumber;
		this.authentification   = new Authentification("" + customerNumber, "ABC123");
		this.wrongPasswordCount = 0;
	}

	public boolean isPinCorrect(int pin) {
		return this.authentification.isPinCorrect(pin);
	}

	public void setPassword(String oldPassword, String newPassword) throws AuthentificationException {
		try {
			this.authentification.setPassword(oldPassword, newPassword);
		} catch (AuthentificationException e) {
			this.wrongPasswordCount++;
			throw e;
		}
	}

	public void setPIN(String password, int pin) throws AuthentificationException {
		try {
			this.authentification.setInitialPIN(password, pin);
		} catch (AuthentificationException e) {
			this.wrongPasswordCount++;
			throw e;
		}
	}

	public void setPIN(int oldPin, int newPin) throws AuthentificationException {
		try {
			this.authentification.setPIN(oldPin, newPin);
		} catch (AuthentificationException e) {
			this.wrongPasswordCount++;
			throw e;
		}
	}

	public void withdraw(String accountName, double amount)
			throws BalanceInsufficientException, AccountNotFoundException {
		BankAccount account = this.getAccounts().get(accountName);
		if (account != null) {
			account.withdraw(amount, "ATM'den para çekme");
		} else {
			throw new AccountNotFoundException("Cannot find the named account <<<" + accountName + " >>>");
		}
	}

	public void deposit(String accountName, double amount) throws AccountNotFoundException {
		BankAccount account = this.getAccounts().get(accountName.toUpperCase());
		if (account != null) {
			account.deposit(amount, "Para yatırma");
		} else {
			throw new AccountNotFoundException("Cannot find the named account <<< " + accountName + " >>>");
		}
	}

	public Map<String, BankAccount> getAccounts() {
		if (this.accounts == null) {
			this.accounts = new HashMap<>();
		}
		return this.accounts;
	}
	
	public List<BankAccount> listAccounts() {
		List<BankAccount> list = new ArrayList<>();
		Set<Entry<String, BankAccount>> entries = this.accounts.entrySet();
		for (Entry<String, BankAccount> entry : entries) {
			list.add(entry.getValue());
		}
		return list;
	}

	public void addAccount(String name, Currency currency, double startBalance) {
		this.getAccounts().put(name.toUpperCase(), new BankAccount(name, startBalance, currency));
	}

	public int getCustomerNumber() {
		return customerNumber;
	}
}

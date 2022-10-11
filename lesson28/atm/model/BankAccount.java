package com.bilgeadam.course04.lesson28.atm.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Currency;
import java.util.LinkedList;
import java.util.List;

public class BankAccount implements Serializable {
	private static final long        serialVersionUID = 1L;
	private String                   name;
	private double                   balance;
	private Currency                 currency;
	private List<AccountTransaction> transactions;

	public BankAccount(String name, double balance, Currency currency) {
		super();
		this.name     = name;
		this.balance  = balance;
		this.currency = currency;
	}

	public void withdraw(double amount, String description) throws BalanceInsufficientException {
		if (this.balance >= amount) {
			this.balance -= amount;
			this.getTransactions().add(new AccountTransaction(LocalDateTime.now(), amount, description, false));
		} else {
			throw new BalanceInsufficientException("Actual balance does not cover the amount requested. Balance <<<"
					+ this.balance + " " + this.currency.getSymbol() + " >>>");
		}
	}

	public void deposit(double amount, String description) {
		this.balance += amount;
		this.getTransactions().add(new AccountTransaction(LocalDateTime.now(), amount, description, true));
	}

	private List<AccountTransaction> getTransactions() {
		if (this.transactions == null) {
			this.transactions = new LinkedList<>();
		}
		return this.transactions;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public Currency getCurrency() {
		return currency;
	}
}

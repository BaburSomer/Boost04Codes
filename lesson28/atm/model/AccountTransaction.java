package com.bilgeadam.course04.lesson28.atm.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class AccountTransaction implements Serializable {
	private static final long serialVersionUID = 1L;
	private LocalDateTime     transactionDate;
	private double            amount;
	private String            description;
	private boolean           depositing;

	public AccountTransaction(LocalDateTime transactionDate, double amount, String description, boolean depositing) {
		super();
		this.transactionDate = transactionDate;
		this.amount          = amount;
		this.description     = description;
		this.depositing      = depositing;
	}

	public LocalDateTime getTransactionDate() {
		return transactionDate;
	}

	public double getAmount() {
		return amount;
	}

	public String getDescription() {
		return description;
	}

	public boolean isDepositing() {
		return depositing;
	}

	@Override
	public String toString() {
		return "AccountTransactions [transactionDate=" + transactionDate + ", amount=" + amount + ", description="
				+ description + ", depositing=" + depositing + "]";
	}
}

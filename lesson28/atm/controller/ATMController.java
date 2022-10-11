package com.bilgeadam.course04.lesson28.atm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.bilgeadam.course04.lesson28.atm.controller.init.DataRepository;
import com.bilgeadam.course04.lesson28.atm.model.BankAccount;
import com.bilgeadam.course04.lesson28.atm.model.BankCustomer;

public class ATMController {
	private Map<String, BankCustomer> customers;

	public ATMController() {
		this.convertToMap(DataRepository.load());
	}

	private void convertToMap(List<BankCustomer> loadedData) {
		this.customers = new HashMap<>();

		for (BankCustomer bankCustomer : loadedData) {
			this.customers.put("" + bankCustomer.getCustomerNumber(), bankCustomer);
		}
	}

	public boolean isPinCorrect(String customerNumber, String pin) throws Exception {
		BankCustomer customer = this.findCustomer(customerNumber);
		return customer.isPinCorrect(Integer.parseInt(pin));
	}
	
	public BankCustomer findCustomer(String customerNumber) throws Exception {
		BankCustomer customer = this.customers.get(customerNumber);
		if (customer == null) {
			throw new Exception("Customer not found");
		}
		return customer;
	}
	
	public BankAccount findAccount(String customerNumber, String accountName) throws Exception {
		BankCustomer customer = this.findCustomer(customerNumber);
		Map<String, BankAccount> customersAccounts = customer.getAccounts();
		if (customersAccounts == null || customersAccounts.isEmpty()) {
			throw new Exception("Account not found");
		}
		BankAccount account = customersAccounts.get(accountName.toUpperCase());
		if (account == null) {
			throw new Exception("Account not found");
		}
		return account;
	}
	public void deposit(String customerNumber, String accountName, double amountToDeposit, String description) throws Exception {
		BankCustomer customer = this.findCustomer(customerNumber);
		Map<String, BankAccount> customersAccounts = customer.getAccounts();
		if (customersAccounts == null || customersAccounts.isEmpty()) {
			throw new Exception("Account not found");
		}
		BankAccount account = customersAccounts.get(accountName.toUpperCase());
		if (account == null) {
			throw new Exception("Account not found");
		}
		account.deposit(amountToDeposit, description);
	}
}

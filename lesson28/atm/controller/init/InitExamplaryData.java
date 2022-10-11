package com.bilgeadam.course04.lesson28.atm.controller.init;

import java.time.LocalDate;
import java.util.Currency;
import java.util.LinkedList;
import java.util.List;

import com.bilgeadam.course04.lesson28.atm.model.AccountNotFoundException;
import com.bilgeadam.course04.lesson28.atm.model.AuthentificationException;
import com.bilgeadam.course04.lesson28.atm.model.BankCustomer;

public class InitExamplaryData {

	public static void main(String[] args) {

		List<BankCustomer> customers = new LinkedList<>();

		if (args.length > 0 && args[0].equalsIgnoreCase("INIT")) {

			BankCustomer customer = new BankCustomer("Ali İhsan", "Vercan", 123_123_123_12L, LocalDate.of(2002, 2, 2),
					123456);
			customer.addAccount("TL Hesabı", Currency.getInstance("TRY"), 100);
			customer.addAccount("Dolar Hesabı", Currency.getInstance("USD"), 100);
			try {
				customer.setPassword("ABC123", "gizli");
				customer.setPIN("gizli", 1234);
			} catch (AuthentificationException e) {
				e.printStackTrace();
			}
			customers.add(customer);

			customer = new BankCustomer("Alperen", "İkinci", 123_123_123_13L, LocalDate.of(1996, 7, 8), 234567);
			customer.addAccount("TL Hesabı", Currency.getInstance("TRY"), 200);
			customer.addAccount("Avro Hesabı", Currency.getInstance("EUR"), 200);
			try {
				customer.setPIN("ABC123", 4455);
			} catch (AuthentificationException e1) {
				e1.printStackTrace();
			}
			customers.add(customer);

			customer = new BankCustomer("Barış", "Yücetürk", 123_123_123_14L, LocalDate.of(1993, 10, 5), 345678);
			customer.addAccount("TL Hesabı", Currency.getInstance("TRY"), 200);
			try {
				customer.deposit("TL Hesabı", 350);
			} catch (AccountNotFoundException e) {
				e.printStackTrace();
			}
			customers.add(customer);

			DataRepository.save(customers);
		}
		else {
			customers = DataRepository.load();
			for (BankCustomer bankCustomer : customers) {
				System.out.println(bankCustomer);
			}
		}

//		Set<Currency> currencies = Currency.getAvailableCurrencies();
//		for (Iterator iterator = currencies.iterator(); iterator.hasNext();) {
//			Currency currency = (Currency) iterator.next();
//			System.out.println(currency);
//		}
	}
}

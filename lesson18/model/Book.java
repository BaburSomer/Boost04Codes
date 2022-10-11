package com.bilgeadam.course04.lesson18.model;

import java.time.LocalDate;

public class Book extends Product implements Rentable {
	private String author;
	private String publisher;
	private String ISBN;
	
	public Book(String name, LocalDate productionDate, int availableAmount, double basePrice, String author,
			String publisher, String ISBN) {
		super(name, productionDate, availableAmount, basePrice);
		this.author = author;
		this.publisher = publisher;
		this.ISBN = ISBN;
	}

	public String getAuthor() {
		return author;
	}

	public String getPublisher() {
		return publisher;
	}

	public String getISBN() {
		return ISBN;
	}

	@Override
	public String toString() {
		return "Book [author=" + author + ", publisher=" + publisher + ", ISBN=" + ISBN + ", toString()="
				+ super.toString() + "]";
	}

	@Override
	public int getAvailableAmountInfo() {
		return this.getAvailableAmount();
	}

	@Override
	public String getNameInfo() {
		return this.getName();
	}

	@Override
	public void updateAmountInfo(int amount) {
		this.setAvailableAmount(amount);
	}

}

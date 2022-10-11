package com.bilgeadam.course04.lesson20;

public class CacheShirt {
	private Shirt entry;
	
	public void add (Shirt entry) {
		this.entry = entry;
	}
	
	public Shirt get() {
		return this.entry;
	}
}

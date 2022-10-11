package com.bilgeadam.course04.lesson20;

public class CacheString {
	private String entry;
	
	public void add (String entry) {
		this.entry = entry;
	}
	
	public String get() {
		return this.entry;
	}
}

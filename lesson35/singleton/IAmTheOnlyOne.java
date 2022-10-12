package com.bilgeadam.course04.lesson35.singleton;

public class IAmTheOnlyOne {
	private static IAmTheOnlyOne instance;

	private IAmTheOnlyOne() {
		super();
	}

	public static IAmTheOnlyOne getInstance() {
		if (instance == null)
			instance = new IAmTheOnlyOne();
		return instance;
	}
}

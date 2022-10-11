package com.bilgeadam.course04.lesson13.model;

public class Animal {
	private static int counter;
	private static int catCounter;

	private String name;
	private String species;
	
	public Animal() {
		super();
		counter++;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
		if (species.equalsIgnoreCase("kedi")) {
			catCounter++;
		}
	}
	
	public static int getNumberOfAnimals() {
		return Animal.counter;
	}

	public static int getNumberOfCats() {
		return Animal.catCounter;
	}
	
	public static int getNumberOfDogs() {
		return Animal.counter - catCounter;
	}
	
	@Override
	public String toString() {
		return "Animal [name=" + name + ", species=" + species + "]";
	}
	
}

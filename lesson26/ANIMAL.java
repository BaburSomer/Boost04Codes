package com.bilgeadam.course04.lesson26;

public enum ANIMAL {
	CAT("ANIMAL.CAT", "miyav"), DOG("ANIMAL.DOG", "hav hav"), 
	COW("ANIMAL.COW", "mööö"), TIGER("ANIMAL.TIGER", "vraoow"), 
	BIRD("ANIMAL.BIRD", "cik cik"), NOT_FOUND("ANIMAL.NOT_FOUND", "--------------"); 

	private String name;
	private String sound;

	ANIMAL(String propertiesKey, String sound) {
		this.name = Properties.getString(propertiesKey);
		this.sound = sound;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String giveSound () {
		return this.sound;
	}
	
	public static ANIMAL getAnimalByName(String name) {
		ANIMAL retVal = NOT_FOUND;
		
		if (name.equalsIgnoreCase(CAT.getName()))
			retVal = CAT;
		else if (name.equalsIgnoreCase(DOG.getName()))
			retVal = DOG;
		else if (name.equalsIgnoreCase(COW.getName()))
			retVal = COW;
		else if (name.equalsIgnoreCase(TIGER.getName()))
			retVal = TIGER;
		else if (name.equalsIgnoreCase(BIRD.getName()))
			retVal = BIRD;
		
		return retVal;
	}
}

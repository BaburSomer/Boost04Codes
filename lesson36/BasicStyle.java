package com.bilgeadam.course04.lesson36;

public class BasicStyle implements IFurnitureStyle {

	@Override
	public String giveSomeInformation() {
		return "Sadelik esastır";
	}
	
	@Override
	public String getStyleName() {
		return "Sade Stil";
	}

}

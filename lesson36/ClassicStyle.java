package com.bilgeadam.course04.lesson36;

public class ClassicStyle implements IFurnitureStyle {

	@Override
	public String giveSomeInformation() {
		return "Aşırı klasiğim";
	}

	@Override
	public String getStyleName() {
		return "Klasik Stil";
	}
}

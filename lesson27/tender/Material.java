package com.bilgeadam.course04.lesson27.tender;

import com.bilgeadam.course04.lesson27.tender.i18n.MultiLanguageSupport;

public enum Material {
	STEEL(MultiLanguageSupport.getString("Materials.STEEL")), 
	TIMBER(MultiLanguageSupport.getString("Materials.TIMBER")), 
	MASONRY(MultiLanguageSupport.getString("Materials.MASONRY"));

	private String localName;

	Material(String localName) {
		this.localName = localName;
	}
	
	public static Material getMaterialByLocalName(String localName) throws MaterialNotFoundException {
		if (localName.equalsIgnoreCase(STEEL.localName))
			return STEEL;
		
		if (localName.equalsIgnoreCase(TIMBER.localName))
			return TIMBER;

		if (localName.equalsIgnoreCase(MASONRY.localName))
			return MASONRY;
		
		throw new MaterialNotFoundException("Material not found <<< " + localName + " >>>");
	}

}

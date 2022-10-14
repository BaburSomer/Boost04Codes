package com.bilgeadam.course04.lesson36;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.StringTokenizer;

public class FurnitureShopProperties {
	private static FurnitureShopProperties instance;
	
	private Properties properties;
	private String     fileName;
	
	private Map<String, ReflectionData> typeClasses;
	private Map<String, ReflectionData> styleClasses;

	private List<Furniture> furnitures;
	
	private FurnitureShopProperties() {
		super();
	}

	public List<Furniture> getFurnitures() {
		if (furnitures == null) {
			furnitures = new ArrayList<>();
		}
		return furnitures;
	}

	
	public static FurnitureShopProperties getInstance() {
		if (instance == null) {
			instance = new FurnitureShopProperties();
		}
		return instance;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public void getFurnitureStyles() {
		String loadedStyles = this.getProperties().getProperty("styles");
		if (loadedStyles == null) {
			System.err.println("Değer okunamadı");
			System.exit(101);
		}

		/*
		 * Gelen token'lar iki bilgi içeriyor: İlki programda kullanılan "türkçe" isim - ikincisi bu isme karşılık gelen sınıs adı
		 * bu iki bilgi birbirinden : ile ayrılmış durumda
		 */
		StringTokenizer tokenizer = new StringTokenizer(loadedStyles, ","); // ==> Tok'lar bu şekilde geliyor: Klasik:Classic

		while (tokenizer.hasMoreTokens()) {
			String styleInfo = (String) tokenizer.nextToken();
			// Klasik:Classic
			// 01234567890123
			//           1111
			int pos =  styleInfo.indexOf(":");  // string'in pos() yönemi o String içinde aranılan harf veya metin parçasının başlangıç indeksini geri döner
			// pos burada 6 sayısını geri döndü. ==> yani 0 ile 6 arasında styleInfo ilk kısmı ve 7'den itibaren ikinci kısmı bulunmakta
			// String'in substring(0, pos) yöntemi iki sınır arasında bulunan bir metni geri döner
			// String'in substring(pos) yöntemi verilen bir pozisyondan string'in sonuna dek olan bir metni geri döner
			ReflectionData ref = new ReflectionData(styleInfo.substring(0, pos), styleInfo.substring(pos+1));
			this.getStyleClasses().put(ref.getName(), ref);
		}
	}
	
	private Map<String, ReflectionData> getStyleClasses() {
		if (this.styleClasses == null) this.styleClasses = new HashMap<>();
		return this.styleClasses;
	}

	
	public ReflectionData retrieveReflectionDataForTypes (String typeName) {
		return this.getTypeClasses().get(typeName);
	}
	
	public ReflectionData retrieveReflectionDataForStyles (String styleName) {
		return this.getStyleClasses().get(styleName);
	}
	
	public void getFurnitureTypes() {
		String loadedTypes = this.getProperties().getProperty("types");
		if (loadedTypes == null) {
			System.err.println("Değer okunamadı");
			System.exit(202);
		}
		
		StringTokenizer tokenizer = new StringTokenizer(loadedTypes, ";");

		while (tokenizer.hasMoreTokens()) {
			String typeInfo = (String) tokenizer.nextToken();
			int pos =  typeInfo.indexOf(":");
			ReflectionData ref = new ReflectionData(typeInfo.substring(pos+1), typeInfo.substring(0, pos));
			this.getTypeClasses().put(ref.getName(), ref);
		}
	}

	private Map<String, ReflectionData> getTypeClasses() {
		if (this.typeClasses == null) this.typeClasses = new HashMap<>();
		return this.typeClasses;
	}

	private Properties getProperties() {

		if (this.properties == null) {
			if (this.fileName == null) {
				System.err.println("Dosya tanımlı değil");
				System.exit(404);
			}
			try (InputStream is = new FileInputStream(this.fileName)) {
				this.properties = new Properties();
				this.properties.load(is);
			} catch (Exception e) {
				System.err.println("Dosya okunamadı");
				System.exit(303);
			}
		}
		return this.properties;
	}

	public String getDataFile() {
		return this.getProperties().getProperty("dataFile");
	}
}

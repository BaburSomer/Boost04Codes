package com.bilgeadam.course04.lesson36;

public class FurnitureFactory {

	public static void create(String line) {
		/*
		 * Line bilgisi aşağıdaki şek,il ve örneklerde geliyor
		 * Type;Stil;Renk;Fiyat;Materyal;Kumaş;Cila;Ayak Adedi
		 * Masa;Modern;Beyaz;120;;;Mat; Koltuk;Klasik;Sarı;125;;Taytüyü;; Masa;Art
		 * Nouveau;Kırmızı;130;;;Parlak; Sandelye;Basit;Mavi;135;Maun;;;4
		 * Zigon;Modern;Yeşil;140;;;;
		 */
		
		int pos = line.indexOf(";"); // ilk noktalı virgülün indeksi. Ondan önceki metin bilgisi hangi sınıfı üreteceğimi belirliyor
		
		String furnitureType = line.substring(0, pos); // Type
		String furnitureInfo = line.substring(pos + 1); // Cins;Renk;Fiyat;Materyal;Kumaş;Cila;Ayak Adedi
		pos = furnitureInfo.indexOf(";");
		String furnitureStyle = furnitureInfo.substring(0, pos); // Style
		furnitureInfo = furnitureInfo.substring(pos + 1); // Renk;Fiyat;Materyal;Kumaş;Cila;Ayak Adedi
		
		StyleFactory styleFactory = StyleFactory.getFactory(furnitureStyle);
		styleFactory.create(furnitureType, furnitureInfo);
	}
}

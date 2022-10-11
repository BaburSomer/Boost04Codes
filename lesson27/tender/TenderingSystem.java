package com.bilgeadam.course04.lesson27.tender;

import java.util.Scanner;

import com.bilgeadam.course04.lesson27.tender.i18n.MultiLanguageSupport;

public class TenderingSystem {
	private Scanner sc;

	public TenderingSystem() {
		super();
		this.sc = new Scanner(System.in);
	}

	public static void main(String[] args) {
		TenderingSystem system = new TenderingSystem();
		system.menu();
		system.sc.close();
	}

	private void menu() {
		showTitle();

		System.out.println(MultiLanguageSupport.getString("TenderingSystem.LANGUAGE_SELECTION")); //$NON-NLS-1$
		String language = this.sc.nextLine();
		MultiLanguageSupport.init(language);

		while (true) {
			showTitle();
			System.out.println(MultiLanguageSupport.getString("TenderingSystem.MATERIAL_SELECTION"));
			String material = sc.nextLine();
			try {
				System.out.println("Şeçilen malzeme: " + Material.getMaterialByLocalName(material));
			} catch (MaterialNotFoundException e) {
				System.err.println(e.getMessage());
			}
			
		}

	}

	private void showTitle() {
		System.out.println(MultiLanguageSupport.getString("TenderingSystem.SPLITTER")); //$NON-NLS-1$
		System.out.println(MultiLanguageSupport.getString("TenderingSystem.TITLE")); //$NON-NLS-1$
		System.out.println(MultiLanguageSupport.getString("TenderingSystem.SPLITTER")); //$NON-NLS-1$
	}
}

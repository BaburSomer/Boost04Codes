package com.bilgeadam.course04.lesson14;

import java.util.Scanner;

import com.bilgeadam.course04.lesson14.model.Item;

public class TheBakkal {
	private static final int MAX_ITEMS = 5;  // bir sabit tanımladık, listeminiz büyüklüğünü belirlemek için
	private Scanner input;
	private Item[]  items;
	private int 	itemCount;
	
	
	public static void main(String[] args) {
		TheBakkal bakkal = new TheBakkal();
		
		bakkal.itemCount = 0;
		bakkal.items = new Item[MAX_ITEMS];   // bir array yaratılma yolu. MAX_ITEMS kadar öğesi olan bir array yarattık
		
		bakkal.menu();
		System.out.println("Bakkalımızı ziyaret ettiğiniz için teşekkürler");
	}

	private void menu() {
		
		this.input = new Scanner(System.in);
		while (true) {
			System.out.println("================");
			System.out.println(" Kardeşler Gıda ");
			System.out.println("================\n");
			System.out.println("1 - Yeni ürün girişi");
			System.out.println("2 - Ürünleri listele ");
			System.out.println("3 - Alışveriş yap ");
			System.out.println("4 - Eve dön\n");
			System.out.print("Lütfen seçiminizi yapınız: ");
			int selection = this.input.nextInt(); 
			input.nextLine();   // her sayı bilgisi okunduktan sonra bir sonraki girişte hata yaşamamak için nextLine() metodunu çağırın
			
			if (selection == 4) {
				break;
			}
			if (!this.processSelection(selection)) {
				System.err.println("Yanlış seçim yaptınız. Lütfen tekrarlayın!");
				continue;
			}
		}
		this.input.close();
	}

	private boolean processSelection(int selection) {
		boolean returnValue = true;
		
		switch (selection) {
		case 1:
			this.createGood();
			break;
		case 2:
			this.listGoods();
			break;
		case 3:
			this.shopping();
			break;
		default:
			returnValue = false;
		}
		
		return returnValue;
	}
	private void shopping() {
		boolean continueShopping = true;
		
		if (itemCount == 0) {  // bunun yerine if (items[0] == null)
			System.out.println("Bakkal kapalı");
			return;
		}

		System.out.println("Alış Veriş");
		System.out.println("==========\n");
		double totalPrice = 0.0;
		do {
			System.out.print("Almak istediğiniz ürünü belirtiniz (bitirmek için TAMAM): ");
			String itemName = input.nextLine();
			if (itemName.equalsIgnoreCase("TAMAM")) {
				System.out.println("Güle güle");
				continueShopping = false; // do-while'ı göstermek için, böyle yazdık. Aslında break ile daha temiz olurdu
			}
			else {
				Item item = itemExists(itemName);
				if (item == null) {
					System.out.println("İstediğiniz ürün depoda bulunmamakta. Başka nasıl yardımcı olabilirim?");
					continue;
				}
				System.out.print("Kaç " + item.getUnit() + " " + item.getName() + " almak istiyorsunuz?");
				double amount = input.nextDouble();
				input.nextLine();
				if (amount > item.getAmount()) {
					System.out.println("İstediğiniz miktarda " + item.getName() + " yok. En fazla " + 
				                                                 item.getAmount() + " " + item.getUnit() +  " alabilirsiniz.");
				}
				else {
					double price = (amount * item.getUnitPrice()) * (1 + item.getVatRate() / 100);
					System.out.println(amount + " " + item.getUnit() + " için toplam KDV dahil fiyat: " + price);
					totalPrice += price;
					item.setAmount(item.getAmount()-(int)amount);
				}
			}
		} while (continueShopping);
		
		if (totalPrice == 0.0) {
			System.out.println("Alış veriş yapmadan ayrılıyorsunuz");
		}
		else {
			System.out.println("Lütfen kasada " + totalPrice + " TL ödeyiniz");
		}
	}

	private Item itemExists(String itemName) {
		Item retVal = null;
		for (int i=0; i<items.length;i++) {
			if (items[i] == null) {
				break;
			}
			if (items[i].getName().equalsIgnoreCase(itemName) && items[i].getAmount() > 0.0) {
				retVal = items[i];
				break;
			}
		}
		return retVal;
	}

	private void listGoods() {
		if (itemCount == 0) {
			System.out.println("Depoda ürün yok");
			return;
		}
		System.out.println("Ürün Listesi");
		System.out.println("============\n");
		for (int i=0; i < items.length; i++) {   // yerine yazılabilirdi: for (int i=0; i < MAX_ITEMS; i++) 
			if (items[i] == null) {
				break;
			}
			System.out.println((i + 1) + ". Ürün: " + items[i]);
		}
	}

	private void createGood() {
		
		if (itemCount >= MAX_ITEMS) {
			System.err.println("Depoda yer kalmadı");
			return;
		}
		
		System.out.println("Yeni Ürün Girişi");
		System.out.println("================\n");
		
		System.out.print("Ürün ismini giriniz: ");
		String itemName = this.input.nextLine();
		System.out.print("Ürün birimini giriniz: ");
		String unit = input.nextLine();
		System.out.print("Ürün birim fiyatını giriniz: ");
		double unitPrice = input.nextDouble();
		input.nextLine();
		System.out.print("Ürün KDV oranını giriniz: ");
		int vat = input.nextInt();
		input.nextLine();
		
		System.out.print("Ürün miktarını giriniz: ");
		int amount = input.nextInt();
		input.nextLine();
		
		Item item = new Item(); 
		item.setName(itemName);
		item.setUnit(unit);
		item.setUnitPrice(unitPrice);
		item.setVatRate(vat);
		item.setAmount(amount);
		
		items[itemCount++] = item;
		/* yukarıdaki ifade yerine bunlar da kullanılabilir
		itemCount += 1;
		itemCount = itemCount +1;
		itemCount++;
		*/
		System.out.println(item);
	}
}

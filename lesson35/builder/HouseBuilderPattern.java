package com.bilgeadam.course04.lesson35.builder;

public class HouseBuilderPattern {
	private String street;	// must-have
	private String city;	// must-have
	private int doorNumber;	// must-have
	private int numOfStoreys; // can-have / optional
	private int numOfrooms; // can-have / optional
	private int numOfWCs; // can-have / optional
	private boolean apartment; // can-have / optional
	private int usableSpace; // can-have / optional
	private KitchenType kitchenType; // can-have / optional
	private int numBalconies; // can-have / optional
	private boolean patio; // can-have / optional
	private boolean terrace; // can-have / optional
	
	/*
	 * YEDİNCİ adım: xxxBuilder objesi alan ve asıl değerleri atayan bir privateyapıcı yöntem tanımlanır
	 */
	private HouseBuilderPattern(HouseBuilder houseBuilder) {
		this.street = houseBuilder.street;
		this.city = houseBuilder.city;
		this.doorNumber = houseBuilder.doorNumber;
		this.numOfStoreys = houseBuilder.numOfStoreys;
		this.numOfrooms = houseBuilder.numOfrooms;
		this.numOfWCs = houseBuilder.numOfWCs;
		this.apartment = houseBuilder.apartment;
		this.usableSpace = houseBuilder.usableSpace;
		this.kitchenType = houseBuilder.kitchenType;
		this.numBalconies = houseBuilder.numBalconies;
		this.patio = houseBuilder.patio;
		this.terrace = houseBuilder.terrace;
	}

	@Override
	public String toString() {
		return "HouseBuilderPattern [street=" + street + ", city=" + city + ", doorNumber=" + doorNumber
				+ ", numOfStoreys=" + numOfStoreys + ", numOfrooms=" + numOfrooms + ", numOfWCs=" + numOfWCs
				+ ", apartment=" + apartment + ", usableSpace=" + usableSpace + ", kitchenType=" + kitchenType
				+ ", numBalconies=" + numBalconies + ", patio=" + patio + ", terrace=" + terrace + "]";
	}



	/*
	 * İLK adım: sonu Builder ile biten bir iç public static sınıf tanımlanır.
	 */
	public static class HouseBuilder {
		/*
		 * İKİNCİ adım: Asıl sınıftaki tüm field'lerin bir kopyası bu iç sınıfa da yazılır
		 */
		private String street;
		private String city;
		private int doorNumber;
		private int numOfStoreys;
		private int numOfrooms;
		private int numOfWCs;
		private boolean apartment;
		private int usableSpace;
		private KitchenType kitchenType;
		private int numBalconies;
		private boolean patio;
		private boolean terrace;
		
		/*
		 * ÜÇÜNCÜ adım: zorunlu tüm fieldleri içeren bir yapıcı method tanımlanır
		 */
		public HouseBuilder(String street, String city, int doorNumber) {
			super();
			this.street = street;
			this.city = city;
			this.doorNumber = doorNumber;
		}


		/*
		 * DÖRDÜNCÜ Adım: zorunlu olmayan her field için field'in adı ile bir "setter" yöntemi yazıyoruz. 
		 * Ama setter'dan farkı void olmak yerine kendi sınız örneğini geri döndürüyor
		 */
		public HouseBuilder numOfStoreys(int numOfStoreys) {
			this.numOfStoreys = numOfStoreys;
			return this;
		}
		public HouseBuilder numOfrooms(int numOfrooms) {
			this.numOfrooms = numOfrooms;
			return this;
		}
		public HouseBuilder numOfWCs(int numOfWCs) {
			this.numOfWCs = numOfWCs;
			return this;
		}
		public HouseBuilder usableSpace(int usableSpace) {
			this.usableSpace = usableSpace;
			return this;
		}
		public HouseBuilder numBalconies(int numBalconies) {
			this.numBalconies = numBalconies;
			return this;
		}
		public HouseBuilder apartment(boolean apartment) {
			this.apartment = apartment;
			return this;
		}
		public HouseBuilder patio(boolean patio) {
			this.patio = patio;
			return this;
		}
		public HouseBuilder terrace(boolean terrace) {
			this.terrace = terrace;
			return this;
		}
		public HouseBuilder kitchenType(KitchenType kitchenType) {
			this.kitchenType = kitchenType;
			return this;
		}
		
		/*
		 * BEŞİNCİ adım: bir build() methodunun oluşturulması. Bu method geriye asıl çalışmak istediğimiz sınıfın bir örneğini dönecek
		 */
		public HouseBuilderPattern build () {
			HouseBuilderPattern house = new HouseBuilderPattern(this);
			validateHouseBuilderObject(house);
			return house;
		}

		/*
		 * ALTINCI (zorunlu olmayan) adım. Üretilen objenin belirli kıstaslara göre doğruluğunu kontrol etmek amacı ile kullanılır. 
		 */
		private void validateHouseBuilderObject(HouseBuilderPattern house) {
			// do some validations if needed.
			// üretilen objenin mantıklı bir çerçevede üretilip üretilmediği kontrol edilebilir
		}
		
	}
}

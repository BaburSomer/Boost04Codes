package com.bilgeadam.course04.lesson17.model;

public interface Perishable {
//	public static final int XXX;   Java buna izin vermez, muhakkak değerinin de atanmış olması gerekir
	
	/**
	 * Bu metod bir ürünün kaç gün içinde bozulacağını hesaplamak üzere bozulabilir her ürün için implemente edilmelidir
	 * @return day to perish
	 */
	int getDaysToPerish();
	
	int getShelfLifeInDays();
	
	default boolean isPerished() {
		return false;
	}
}

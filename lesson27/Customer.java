package com.bilgeadam.course04.lesson27;

public class Customer implements Generalable { // Interface Segregation 
	// bir arayüz muhakkak tek bir kabiliyet kazandırmalı. Genel bir arayüz nedeni ile bir 
	// müşterinin çevresini hesaplamak zorunda kalmamalıyız

	@Override
	public boolean isHealty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setCustomerId() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getAddress() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int calculatePerimeter() {
		// is not used ya da do nothing gibi comment'ler yazmak zorunda kalmamaız gerekli
		return 0;
	}

}

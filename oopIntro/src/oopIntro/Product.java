package oopIntro;

public class Product {

	public Product() {
		System.out.println("Ben çalýþtým");
	}
	// bizim e ticaret sistesi online bakacýlýk sistemine bizim datalarý kontrol etigimiz sistem bu.
	
	public Product(int id, String name, double unitPrice, String detail) {
		 
		//this bu classtaki demek ve bizim deðerelerimizi atamamýza yardýmcý olur.
		//phaytonda self ile ayný mantýktadýr aslýnda .
		//this(); bunu yapamak bizim kaydedimeiþ boþ bir constraktýrýmýz var ise onu çalýþmasýnýn saðlar.
		
		
		this();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
		
	};
	// *****dont repeat yourself en önemli kurarlardan biri.******
	
	int id;
	String name;
	double unitPrice;
	String detail;
	
}

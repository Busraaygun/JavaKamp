package oopIntro;

public class Product {

	public Product() {
		System.out.println("Ben �al��t�m");
	}
	// bizim e ticaret sistesi online bakac�l�k sistemine bizim datalar� kontrol etigimiz sistem bu.
	
	public Product(int id, String name, double unitPrice, String detail) {
		 
		//this bu classtaki demek ve bizim de�erelerimizi atamam�za yard�mc� olur.
		//phaytonda self ile ayn� mant�ktad�r asl�nda .
		//this(); bunu yapamak bizim kaydedimei� bo� bir constrakt�r�m�z var ise onu �al��mas�n�n sa�lar.
		
		
		this();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
		
	};
	// *****dont repeat yourself en �nemli kurarlardan biri.******
	
	int id;
	String name;
	double unitPrice;
	String detail;
	
}

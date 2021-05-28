package oopIntro;

public class main {

	public static void main(String[] args) {
		
	/* 
	 burada verileri arrayle þeklinde tanýmlamayýz burda objelerle iþlerimizi halederiz çünkü 
	 1 cihazýn 1 den fazla özelikle tanýmlýyoruz.
    */
		/*
		Product produt1 = new Product(); // referans oluþturma , intance 
		produt1.id = 1;
		produt1.name = "Lenovo V14";
		produt1.unitPrice = 15000;
		produt1.detail = "16GB Ram";
		
		Product produt2 = new Product();  
		produt2.id = 2;
		produt2.name = "Lenovo V15";
		produt2.unitPrice = 16000;
		produt2.detail = "32GB Ram";
		
		Product produt3 = new Product(); 
		produt3.id = 3;
		produt3.name = "HP 5";
		produt3.unitPrice = 10000;
		produt3.detail = "8GB Ram";
		// *****claslar referans deðilidr.******
		*/
		// normalde burdaki bulok uzundu ama yapýcý blok vasýtasý ile kodu kýsaltmýþ olduk
		
		//bir condtraktýr çalýþmak zorunda  birden fazla constraktýr varsa sadece 1 çalýþmakta.
		 
		Product product1 = new Product(1, "Lenevo V14", 15000, "16GB Ram");
		Product product2 = new Product(2, "Lenovo V15", 16000, "32GB Ram ");
		Product product3 = new Product(3, "HP 5",10000, "8GB Ram");
		
		Product[] products = {product1,product2,product3};
		
		for(Product product : products) {
			System.out.println(product.name );
		}
		
		
		System.out.println (products.length); 
		
		Category category1 = new Category();
		category1.id =1;
		category1.name ="Bilgisayar";
		
		Category category2 = new Category();
		category2.id =2;
		category2.name ="Ev/Bahçe";
		
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		
		productManager.addToCart(product2);
		
		productManager.addToCart(product3);
		

	}
	
	}

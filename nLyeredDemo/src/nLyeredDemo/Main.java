package nLyeredDemo;

import nLyeredDemo.business.abstracts.ProductService;
import nLyeredDemo.business.concrects.ProductManager;
import nLyeredDemo.dataAccess.concretes.AbcProductDao;
import nLyeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		 ProductService productService = new ProductManager(new AbcProductDao());
        
		 Product product = new Product(1,1,"Elma", 12, 50);
		productService.add(product);		 
		 
}
}
  
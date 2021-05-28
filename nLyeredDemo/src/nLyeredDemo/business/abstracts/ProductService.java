package nLyeredDemo.business.abstracts;

import java.util.List;

import nLyeredDemo.entities.concretes.Product;

public interface ProductService {
	
	void add(Product product);
	List<Product> getAll();

}

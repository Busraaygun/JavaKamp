package nLyeredDemo.business.concrects;

import java.util.List;

import nLyeredDemo.business.abstracts.ProductService;
import nLyeredDemo.core.jLoggerManagerAdapter;
import nLyeredDemo.core.loggerService;
import nLyeredDemo.dataAccess.abstracts.ProductDao;
import nLyeredDemo.dataAccess.concretes.AbcProductDao;
import nLyeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService {

	private ProductDao productDao;
	private loggerService loggerService;
	
	public ProductManager(ProductDao productDao, loggerService loggerService) {
		super();
		this.setProductDao(productDao);
		this.loggerService =loggerService;
	}

	
	public ProductManager(AbcProductDao productDao2) {
		// TODO Auto-generated constructor stub
	}


	@Override
	public void add(Product product) {
		// iþ kodlarý çalýþýr burada.
		if(product.getId()==1) {
			System.out.println("Bu katagoriyde ürün kabul edilmiyor");
			return;
		}
		
		
		
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public ProductDao getProductDao() {
		return productDao;
	}

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

}

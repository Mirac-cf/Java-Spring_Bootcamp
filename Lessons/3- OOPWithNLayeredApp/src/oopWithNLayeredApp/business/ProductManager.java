package oopWithNLayeredApp.business;

import oopWithNLayeredApp.core.loging.Logger;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	//iş kuralları
	private ProductDao productDao;
	private Logger[] loggers;
	
	
	public ProductManager(ProductDao productDao, Logger[] loggers) {
		this.productDao = productDao;
		this.loggers = loggers;
	}


	public void add(Product product) {
		this.productDao.add(product);
		
		for (Logger logger : loggers) { //[db,File,...]
			logger.log(product.getName());
		}
	}
	
	
	
}

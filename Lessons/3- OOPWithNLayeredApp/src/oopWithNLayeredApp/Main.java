package oopWithNLayeredApp;

import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.core.loging.DatabaseLogger;
import oopWithNLayeredApp.core.loging.FileLogger;
import oopWithNLayeredApp.core.loging.Logger;
import oopWithNLayeredApp.core.loging.MailLogger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.entities.Product;


public class Main {
	public static void main(String[] args) {
		
		Logger[] loggers = {new DatabaseLogger(),new FileLogger(),new MailLogger()};
		
		ProductManager productManager = new ProductManager(new JdbcProductDao(),loggers);             
		
		Product product = new Product(1,"Samsung",10000);
		
		productManager.add(product);
		
	}
}

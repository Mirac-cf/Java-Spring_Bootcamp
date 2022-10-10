package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao{
	//sadece ve sadece db erişim kodları buraya yazılır... 
	
	public void add(Product product) {
		System.out.println("Jdbc ile veri tabanina eklendi");
	}
	
	
	
}




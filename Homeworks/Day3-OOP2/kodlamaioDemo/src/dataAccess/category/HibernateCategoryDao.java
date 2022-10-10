package dataAccess.category;

import dataAccess.CategoryDao;
import entities.Category;

public class HibernateCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Category Hibernate ile veritabanina eklendi");
	}

	@Override
	public void delete(Category category) {
		System.out.println("Category silindi...");
	}
	
}

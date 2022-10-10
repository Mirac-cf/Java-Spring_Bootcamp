package dataAccess.category;

import dataAccess.CategoryDao;
import entities.Category;

public class JdbcCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Category Jdbc ile veritabanina eklendi");
	}

	@Override
	public void delete(Category category) {
		System.out.println("Category silindi...");
	}

}

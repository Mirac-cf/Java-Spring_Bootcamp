package business;

import dataAccess.CategoryDao;
import entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	
	public CategoryManager(CategoryDao categoryDao) {
		this.categoryDao = categoryDao;
	}

	public void add(Category category) {
		categoryDao.add(category);
	}
	
	public void delete(Category category) {
		categoryDao.delete(category);
	}

	
}

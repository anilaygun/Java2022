package kodlamaioWithNLayerApp.dataAccess.hibernate;

import kodlamaioWithNLayerApp.dataAccess.ICategoryDao;
import kodlamaioWithNLayerApp.entities.Category;

public class HibernateCategoryDao implements ICategoryDao {
	public void add(Category category) {
		System.out.println(category.getCategoryName() + " Kategorisi Hibernate ile eklendi.");

	}
}

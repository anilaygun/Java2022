package kodlamaioWithNLayerApp.dataAccess.jdbc;

import kodlamaioWithNLayerApp.dataAccess.ICategoryDao;
import kodlamaioWithNLayerApp.entities.Category;

public class JdbcCategoryDao implements ICategoryDao {
	public void add(Category category) {
		System.out.println(category.getCategoryName() + " Kategorisi Jdbc ile eklendi.");
		
	}
}

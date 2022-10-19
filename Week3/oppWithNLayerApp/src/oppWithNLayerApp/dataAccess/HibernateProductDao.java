package oppWithNLayerApp.dataAccess;

import oppWithNLayerApp.entities.Product;

public class HibernateProductDao implements ProductDao {
	public void add(Product product) {
		// Db erişim kodları...SQL
		System.out.println("Hibernate ile veri tabanına eklendi");

	}
}

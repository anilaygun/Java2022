package oppWithNLayerApp.dataAccess;

import oppWithNLayerApp.entities.Product;

public class jdbcProductDao implements ProductDao {
	public void add(Product product) {
		// Db erişim kodları...SQL
		System.out.println("JDBC ile veri tabanına eklendi");

	}
}

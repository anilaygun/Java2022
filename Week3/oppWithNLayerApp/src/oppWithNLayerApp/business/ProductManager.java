package oppWithNLayerApp.business;

import java.util.List;

import oppWithNLayerApp.core.logging.Logger;
import oppWithNLayerApp.dataAccess.HibernateProductDao;
import oppWithNLayerApp.dataAccess.ProductDao;
import oppWithNLayerApp.dataAccess.jdbcProductDao;
import oppWithNLayerApp.entities.Product;

public class ProductManager {
	private ProductDao productDao;
	private Logger[] loggers;

	public ProductManager(ProductDao productDao, Logger[] loggers) {
		this.productDao = productDao;
		this.loggers = loggers;
	}

	public void add(Product product) throws Exception {
		// İş kuralları
		if (product.getUnitPrice() < 10) {
			throw new Exception("Ürün fiyatı 10 dan küçük olamaz");
		}

		productDao.add(product);
		for (Logger logger : loggers) { //[db,mail]
			logger.log(product.getName());

		}
	}
}

package oppWithNLayerApp;

import java.util.List;

import oppWithNLayerApp.business.ProductManager;
import oppWithNLayerApp.core.logging.DatabaseLogger;
import oppWithNLayerApp.core.logging.FileLogger;
import oppWithNLayerApp.core.logging.Logger;
import oppWithNLayerApp.core.logging.MailLogger;
import oppWithNLayerApp.dataAccess.HibernateProductDao;
import oppWithNLayerApp.dataAccess.jdbcProductDao;
import oppWithNLayerApp.entities.Product;

public class Driver {

	public static void main(String[] args) throws Exception {
		Product product1 = new Product(1, "Iphone 11", 9000);
		Logger[] loggers =  {new DatabaseLogger(), new FileLogger(), new MailLogger()};
		ProductManager productManager = new ProductManager(new HibernateProductDao(), loggers);
		productManager.add(product1);
	}

}

package abstractDemo;

public class Driver {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		customerManager.databaseManager = new MySqlDatabseManager();
		customerManager.getCustomer();

	}

}

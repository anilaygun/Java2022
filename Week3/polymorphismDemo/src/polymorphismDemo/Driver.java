package polymorphismDemo;

public class Driver {

	public static void main(String[] args) {
	CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
	customerManager.add();
	}

}

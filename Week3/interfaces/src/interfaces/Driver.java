package interfaces;

public class Driver {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
		
		customerManager.add();

	}

}

package overriding;

public class Driver {

	public static void main(String[] args) {
		BaseCreditManager[] CreditManagers = new BaseCreditManager[] { new TeacherCreditManager(),
				new AgricultureCreditManager(), new StudentsCreditManager() };

		for (BaseCreditManager CreditManager : CreditManagers) {
			System.out.println(CreditManager.calculate(1000));
		}
	}

}

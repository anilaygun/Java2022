package overriding;

public class StudentsCreditManager extends BaseCreditManager {
	public double calculate(double amount) {
		return amount * 1.10;
	}
}

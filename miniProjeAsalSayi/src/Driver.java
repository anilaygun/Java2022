
public class Driver {

	public static void main(String[] args) {
		int number = 2;
		boolean flag = true;

		if (number < 1) {
			System.out.println("Geçersiz sayı : " + number);
		}
		if (number == 1) {
			System.out.println("Sayı asal değildir : " + number);
			return;
		}

		for (int i = 2; i < number; i++) {
			if (number % 2 == 0) {
				flag = false;
			}
		}
		if (flag == true) {
			System.out.println("Sayı asaldır.");
			System.out.println("Sayı : " + number);
		} else {
			System.out.println("Sayı asal değildir.");
			System.out.println("Sayı : " + number);
		}

	}
}


public class Driver {

	public static void main(String[] args) {
		double[] myList = { 1.2, 1.3, 4.3, 5.6 };
		double toplam = 0;
		double max = myList[0];

		for (double number : myList) {
			if (max < number) {
				max = number;
			}
			toplam = toplam + number;
			System.out.println(number);
		}
		System.out.println("Toplam = " + toplam);
		System.out.println("En büyük sayı =" + max);
	}
}

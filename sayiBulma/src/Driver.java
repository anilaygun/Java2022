
public class Driver {

	public static void main(String[] args) {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 10 };
		int aranacak = 19;
		boolean varMi = false;

		for (int i = 0; i < sayilar.length; i++) {
			if (aranacak == sayilar[i]) {
				varMi = true;
				break;
			}
		}
		if (varMi == true) {
			System.out.println("Sayı bulundu.");
		} else {
			System.out.println("Sayı bulunamadı.");
		}
	}

}

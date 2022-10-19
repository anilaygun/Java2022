package abstractClasses;

public class Driver {

	public static void main(String[] args) {
		//WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
		//womanGameCalculator.calculate();
		//womanGameCalculator.gameOver();
		
		
		GameCalculator[] gameCalculators = {new WomanGameCalculator(), new KidsGameCalculator(),new ManGameCalculator(),new OlderGameCalculator()};
		for (GameCalculator gameCalculator : gameCalculators) {
			System.out.println("Puanınız : " + gameCalculator.calculate()); // Buraya bak!
			
		}

	}

}

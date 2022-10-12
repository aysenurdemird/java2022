package abstractClasses;

public class Main {

	public static void main(String[] args) {

		GameCalculator[] gameCalculators = new GameCalculator[] { new ManGameCalculator(), new WomanGameCalculator(),
				new KidsGameCalculator(), new OlderGameCalculator() };

		for (GameCalculator gameCalculator : gameCalculators) {
			gameCalculator.hesapla();
		}
	}
}
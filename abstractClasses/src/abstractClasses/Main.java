package abstractClasses;

//abstract classların normal classlardan farkı içindeki operasyonları ezmeden newlenmemesi ve içine abstract operasyonlar ekleebilmesidir.

public class Main {

	public static void main(String[] args) {
		WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
		womanGameCalculator.hesapla();
		womanGameCalculator.gameOver();
		
//abstract classları newlemek için içindeki operasyonların bu şekilde ezilmesi gerekir. Tek başına newlenemezler.
		
//		GameCalculator gameCalculator = new GameCalculator() {
//			
//			@Override
//			public void hesapla() {
//				// TODO Auto-generated method stub
//				
//			}
		
// Bu şekilde, abstract classın referansını altındaki classlara atayarak newleyerek GameCalclatorun objesini oluşturabilirim. 
		GameCalculator gameCalculator = new WomanGameCalculator();
		};
}
package abstractClasses;

public class KidsGameCalculator extends GameCalculator{

	@Override //<- Bu ifade kodun okunurluğunun artmasını sağlar ve override edildiğini belirtir. Bunu kullanmadan da override edebiliriz.
	public void hesapla() {
		System.out.println("Puanınız : 100");
	}

}

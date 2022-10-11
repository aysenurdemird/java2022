package methodOverloading;

public class DortIslem {
	public int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}
	
	public int topla(int sayi1, int sayi2, int sayi3) {
		return sayi1 + sayi2;
	}
}


//iki farklı fonksiyonun isimleri aynı olmasına rağmen parametre imzaları farklı olduğu için overloading yapılabilir.
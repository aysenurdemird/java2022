package overriding;
//bir classtaki herhangi bir operasyon default olarak overridable(üzerine yazılabilir, override edilerbilir) tanımlanır. miras alan sınıf, 

//miras aldığı sınıfı override olan fonksiyonda ezebilir.
//final anahtar kelimesi ile metotun default olan overridable özelliği devre dışı bırakılabilir	

public class BaseKrediManager {

// override edilemeyen fonksiyon (final keyword kullanımı) 

//	public final double hesapla(double tutar) {
//	return tutar * 1.18;
//	}

// override edilebilir fonksiyon

	public double hesapla(double tutar) { 
		return tutar * 1.18;
	}

}

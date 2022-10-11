package staticDemo;

public class ProductValidator {
	
	//Constructorlar static nesnelerle çalışmaz. sadece new ile örnek oluşturunca çalışır. eğer static için de çalışan bir constructor istersem
	//bunun için de static constructor oluşturmak gerekir. (static constructorlar birden fazla olacak şekilde oluşturulabilir. tek seferde hepsi çalışır)
	
	static {
		System.out.println("Static Yapıcı blok çalıştı");
	}
	
	public ProductValidator() {
		System.out.println("Yapıcı blok çalıştı");
	}
	
	public static boolean isValid(Product product) {
		if (product.price>0 && !product.name.isEmpty()) {
			return true;
		}else {
			return false;
		}
		
		//ana class (burada staticDemo, static olamaz. ama bu class içinde başka bir class tanımlayarak bunu static yapabilirim)
		//inner class
		
//		public static class innerClass{
//			public static void Sil() {
//				
//			}
		}
	}
}

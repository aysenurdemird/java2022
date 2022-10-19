package staticDemo;
//bir metot statik yapıldığında direkt class ismiyle çağırılır
//static metotlar kullanıldığında constructor çalışmaz, çalışması için static bir constructor tanımlamak gerekir
public class ProductValidator {
	
	static {
		System.out.println("Static yapıcı blok çalıştı");
	}
	public static boolean isValid(Product product) {
		if(product.price > 0 && !product.name.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
}

package staticDemo;

// ProductValidator classındaki isValid fonksiyonunu static tanımladığımız zaman, onu bıurada kullanmak istediğimizde new ile yeni örnek oluşturmadan
//	direkt ProductValidator.isValid(product) yaparak nesnenin örneği oluşur. Ama bu şekilde sadece bir kere örnek oluşur ve daha sonra bütün kullanıcılar o örneği kullanır
// static olmayan nesnelerin örnekleri kullanılmadığı zaman garbage collector tarafından bellekten atılır. ama static ile oluşturulunca atılmaz.
//yani bir metodu static olarak tanımladığımız zaman class isminden nokta kullanarak direkt metoda ulaşabiliriz. (bkz : ProductValidator.isValid)
//içinde static fonksiyon olan bir classın ismiyle sadece static fonksiyona ulaşabiliriz. eğer static olmayan fonksiyonlar da varsa bunlara ulaşmak için örneklerini oluşturmamız gerekir. 

public class ProductManager {
	public void add(Product product) {
		//ProductValidator validator = new ProductValidator();
		if (ProductValidator.isValid(product)) {
			System.out.println("Eklendi");
		}else {
			System.out.println("Ürün bilgileri geçersizdir");
		}
		
	}
}

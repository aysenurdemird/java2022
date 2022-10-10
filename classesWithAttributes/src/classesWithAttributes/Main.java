package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
	    Product product = new Product(1, "Laptop", "Asus Laptop", 3000, 2, "Siyah");
	    /*Constructor blopuna parametre tanımlamama rağmen aşağıdaki şekilde parametresiz newleyip class kullanmak istiyorsam, parametreli
	    constructora ek olarak, ilk başta default tanımlı olan boş constructoru da tekrar el ile tanımlamam gerek, bu şekilde hem parametreli
	    hem parametresiz olarak newleyebilirim. Buna overloading denir.(Aynı isimle iki farklı metot tanımlama)*/
	    /*Product product = new Product();
	    product.setName("Laptop");
	    product.setId(1);
	    product.setDescription("Asus Laptop");
	    product.setPrice(5000);
	    product.setStockAmount(3);*/
	    
	    ProductManager productManager = new ProductManager();
	    productManager.Add(product);
	    System.out.println(product.getKod());
	}
}

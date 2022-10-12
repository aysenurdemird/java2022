package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public interface ProductDao {  //productDao ile ilgili alternatifler bu kod bloğunun içindeki operasyonu içermelidir(isim ve parametre olarak)
	void add(Product product);
}

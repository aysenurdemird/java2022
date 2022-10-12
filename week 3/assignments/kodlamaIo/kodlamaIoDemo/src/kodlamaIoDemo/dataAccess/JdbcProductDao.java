package kodlamaIoDemo.dataAccess;

import kodlamaIoDemo.entities.Product;

public class JdbcProductDao implements ProductDao{
		@Override
		public void add(Product product) {	
			System.out.println("Jdbc ile veritabanına eklendi.");	
		}
}


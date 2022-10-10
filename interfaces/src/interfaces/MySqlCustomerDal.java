package interfaces;

//dal = data access layer(veri tabanı erişim katmanı) veri tabanı ile ilgili operasyonlar için olan classlar bu şekilde isimlendirilmeli
//Bir class birden fazla interfaceyi implemente edebilir. extend etmekten farkı budur.(bir class sadece bir classı extend edebilir)

public class MySqlCustomerDal implements ICustomerDal, IRepository{

	@Override
	public void Add() {
		System.out.println("My sql eklendi.	");
	}

}

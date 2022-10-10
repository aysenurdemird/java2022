package interfaces;

//interfaceler class olmadığı için bu şekilde tanımlanırlar.interfaceler sadece referans tutuculardır.
//bir interfacenin üyelerini public ve abstract olarak tanımlamaya gerek yok. default olarak o şekildedirler.
//interfaceyi implement eden her class içindeki operasyonları içermek zorundadır
//interfaceler de abstractlar gibi newlenemezler. ama onu implement eden classın referansı ile newlenebilir. (bkz : ICustomerDal customerDal = new OracleCustomerDal();)

public interface ICustomerDal {
	void Add();
}

//interfaceler operasyonun sadece implement edilmesi ve implement edildiği yerde operasyonun içinin doldurulması istenen durumlarda kullanılır.
//Çünkü interfaceler içinde sadece imza olarak metot bulundurabilirler(yeni gelen birkaç özellik dışında) ve bunun implement edildiği yerde içinin doldurulması gerekir.

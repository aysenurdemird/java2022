package interfaces;
//bir class birden fazla interfaceyi implemente edebilir
//interfaceler abstractlar gibi newlenemezler, interfaceler onu implemente eden classın referansını tutabilirler
public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
		customerManager.add();
	}

}

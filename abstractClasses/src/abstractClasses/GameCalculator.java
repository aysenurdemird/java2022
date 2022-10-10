package abstractClasses;

//bir abstract classın abstract olabilmesi için, abstract imzasıyla yazılması gerekir. (bkz : public abstract class GameCalculator {...})
//bir abstract operasyonun abstract olabilmesi için abstract imzasıyla yazılması gerekir. (bkz : public abstract void hesapla();)
//abstarct bir class içinde abstract bir operasyon barındırmak zorunda değildir.

public abstract class GameCalculator { 
	
//GameCalculator abstarct classını extend eden classlar kendi içlerinde hesapla fonksiyonunu içermek ve override etmek zorundadır. gameOver fonksiyonunu
//ise final olarak tanımlandığı için override edemez.

	public abstract void hesapla();
	
	public final void gameOver() {
		System.out.println("Oyun bitti");
	}
}


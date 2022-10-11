package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();  //metod çağırma
	}
	
	public static void sayiBulmaca() {
		int[] sayilar = new int[]{1,2,6,7,9,0};
		int aranacak = 6;
		boolean varMi = false;
		
		for (int sayi : sayilar)
		{
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}
		if (varMi) {
			mesajVer("Say‎ı mevcuttur: "+aranacak);
		} else {
			mesajVer("Sayı‎ mevcut değildir: "+aranacak);
		}
	}
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}

}

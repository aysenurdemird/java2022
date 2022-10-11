package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		System.out.println(mesaj);

		System.out.println("Eleman say‎ıs‎ı : " + mesaj.length());
		System.out.println("5. eleman : " + mesaj.charAt(4));
		System.out.println(mesaj.concat(" Yaşasın!")); // Belirtilen stringle verilen stringi birleş‏tirerek yeni bir
														// string olu‏turur.
		System.out.println(mesaj);
		System.out.println(mesaj.startsWith("B")); // Stringin başladığı‎ً‎ karakteri kontrol eder. Doğruysa true döner.
		System.out.println(mesaj.endsWith(".")); // Stringin bittiği karakteri kontrol eder. Doğruysa true döner.
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0); // mesaj stringindeki karakterlerin 0 - 5 arası‎ karakterlerini alı‎r,
												// karakterler arrayinin 0. indexinden itibaren, mesajdan aldığı‎ً‎
												// karakterleri atar.
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf('a')); // Belirtilen karakteri mesaj stringinin içinde ilk bulduğu yerin
												// indexini döndürür. Aramaya soldan başlar.
		System.out.println(mesaj.indexOf("av")); // Karakter dizisini bulur. İndexini döndürür. Aramaya soldan başlar.
		System.out.println(mesaj.lastIndexOf("a")); // indexof fonksioynunun ayn‎ısını‎ yapar. aramaya sağdan ba‏lar.
													// index numaras‎ını sol taraftan itibaren verir.

		String yeniMesaj = mesaj.replace(' ', '-'); // Verilen ilk karakterin olduğu yerleri stringde bulur, ikinci
													// karakterle değiştirir
		System.out.println(yeniMesaj);

		System.out.println(mesaj.substring(2)); // Stringdeki metni verilen indexten itibaren döndürür
		System.out.println(mesaj.substring(2, 5)); // Stringdeki metni verilen indexler aras‎ndaki karakterlerini
													// döndürür

		for (String kelime : mesaj.split(" ")) { // Stringi verilen karakteri bulduğu yerlerden parçalara ay‎ırır ve her
													// parçay‎ı farkl‎ı bir dizi olarak döndürür
			System.out.println(kelime);
		}

		System.out.println(mesaj.toLowerCase()); // Verilen stringin tüm karakterlerini küçük harfe çevirir.
		System.out.println(mesaj.toUpperCase()); // Verilen stringin tüm karakterlerini büyük harfe çevirir.

		mesaj = "    Bugün hava çok güzel.    ";
		System.out.println(mesaj.trim()); // Stringin başındaki ve sonundaki boşlukları siler.
	}
}

package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		System.out.println(mesaj);

		System.out.println("Eleman say‎s‎ : " + mesaj.length());
		System.out.println("5. eleman : " + mesaj.charAt(4));
		System.out.println(mesaj.concat(" Ya‏as‎n!")); // Belirtilen stringle veriler stringi birle‏tirerek yeni bir
														// string olu‏turur.
		System.out.println(mesaj);
		System.out.println(mesaj.startsWith("B")); // Stringin ba‏lad‎ً‎ karakteri kontrol eder. Doًruysa true dِner.
		System.out.println(mesaj.endsWith(".")); // Stringin bittiًi karakteri kontrol eder. Doًruysa true dِner.
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0); // mesaj stringindeki karakterlerin 0 - 5 aras‎ karakterlerini al‎r,
												// karakterler arrayinin 0. indexinden itibaren, mesajdan ald‎ً‎
												// karakterler atar.
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf('a')); // Belirtilen karakteri mesaj stringinin içinde ilk bulduًu yerin
												// indexini dِndürür. Aramaya soldan ba‏lar.
		System.out.println(mesaj.indexOf("av")); // Karakter dizisini bulur. فndexini dِndürür. Aramaya soldan ba‏lar.
		System.out.println(mesaj.lastIndexOf("a")); // indexof fonksioynunun ayn‎s‎n‎ yapar. aramaya saًdan ba‏lar.
													// index numaras‎n‎ sol taraftan itibaren verir.

		String yeniMesaj = mesaj.replace(' ', '-'); // Verilen ilk karakterin olduًu yerleri stringde bulur, ikinci
													// karakterle deًi‏tirir.
		System.out.println(yeniMesaj);

		System.out.println(mesaj.substring(2)); // Stringdeki metni verilen indexten itibaren dِndürür.
		System.out.println(mesaj.substring(2, 5)); // Stringdeki metni verilen indexler aras‎ndaki karakterlerini
													// dِndürür.

		for (String kelime : mesaj.split(" ")) { // Stringi verilen karakteri bulduًu yerlerden parçalara ay‎r‎r ve her
													// parçay‎ farkl‎ bir dizi olarak dِndürür.
			System.out.println(kelime);
		}

		System.out.println(mesaj.toLowerCase()); // Verilen stringin tüm karakterlerini küçük harfe çevirir.
		System.out.println(mesaj.toUpperCase()); // Verilen stringin tüm karakterlerini büyük harfe çevirir.

		mesaj = "    Bugün hava çok güzel.    ";
		System.out.println(mesaj.trim()); // Stringin ba‏‎ndaki ve sonundaki bo‏luklar‎ siler.
	}
}

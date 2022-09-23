package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "       Bugün hava çok güzel!        ";

		System.out.println(mesaj);

		/*
		 * System.out.println("Eleman sayısı= " + mesaj.length());
		 * System.out.println("5.eleman: " + mesaj.charAt(4));
		 * 
		 * // charAt() =bir metinde belli bir karakterdeki // değeri yakalamamız
		 * gerektiğinde kullanıyoruz.
		 * 
		 * System.out.println(mesaj.concat(" Yaşasın!"));// anlık ekliyoruz.
		 * System.out.println(mesaj.startsWith("b"));
		 * System.out.println(mesaj.endsWith("!")); char[] karakterler = new char[5];
		 * mesaj.getChars(0, 5, karakterler, 0); System.out.println(karakterler);
		 * 
		 * System.out.println(mesaj.indexOf("av"));// ilk bulduğunu veriyor.
		 * System.out.println(mesaj.lastIndexOf("a"));
		 */

		String yeniMesaj = mesaj.replace(" ", "");
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2, 9));

		System.out.println("---");

		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		System.out.println("---");

		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());

		System.out.println("---");

		System.out.println(mesaj.trim());
	}

}

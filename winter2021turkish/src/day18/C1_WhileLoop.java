package day18;

public class C1_WhileLoop {

	public static void main(String[] args) {
		// 10'dan 30'a kadar 4 ile bolunebilen sayilari
		// aralarinda bir bosluk olacak sekilde yan yana yazdirin

		// once loop ile yapalim

		for (int i = 10; i <= 30; i++) {
			if (i % 4 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println("");
		// aynisini while loop ile yapalim
		int sayi = 10; // 1.satiri gerceklestirdim(Baslangic degeri)
		while (sayi <= 30) { // ikinci sarti gerceklestirdim
			if (sayi % 4 == 0) {
				System.out.print(sayi + " ");
			}

			sayi++;// 3. sasrti gerceklestirdim(degisim miktari)
		}

	}

}

package day19;

import java.util.Scanner;

public class C3_DoWhileLoop {

	public static void main(String[] args) {
		/*
		 *  kullanicdan toplamak uzere pozitif tam sayilar isteyin islemi bitirmek icin
		 * 0'a basamasini soyleyin kullanici yanlislikla negatof sayi girerse o sayiyi
		 * dikkate almayin ve "negatif sayi giremezsiniz" yazdirip basa dondurun
		 * kullanici 0'a bastiginda toplam kaz pozitif tam sayi girdigini kac negatif
		 * sayi girdigini ve pozitiflerin toplamini yazdirin
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen toplamak icin pozitif tam sayilar girin ve bitirmek icin 0'a basin");

		int sayi = 1;
		int pozTop = 0;
		int pozCount = 0;
		int negCount = 0;

		do {
			sayi = scan.nextInt();
			
			if (sayi <  0) {
				negCount++;
				System.out.println("lutfen pozitif bir sayi giriniz");
			} else {
				pozCount++;
				pozTop += sayi;
			}
		} while (sayi != 0);

		System.out.println(pozCount + " adet pozitif sayi girdiniz ve toplami = " + pozTop);
		System.out.println(negCount + " adet hatali giris yaptiniz (hatali girisler toplama eklenmemistir)");

		scan.close();
	}

}

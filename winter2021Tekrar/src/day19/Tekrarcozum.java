package day19;

import java.util.Scanner;

public class Tekrarcozum {

	public static void main(String[] args) {
		/*
		 * kullanicdan toplamak uzere pozitif tam sayilar isteyin islemi bitirmek icin
		 * 0'a basamasini soyleyin kullanici yanlislikla negatof sayi girerse o sayiyi
		 * dikkate almayin ve "negatif sayi giremezsiniz" yazdirip basa dondurun
		 * kullanici 0'a bastiginda toplam kaz pozitif tam sayi girdigini kac negatif
		 * sayi girdigini ve pozitiflerin toplamini yazdirin
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("toplamak icin pozitif tam sayilar girin. bitirmek icin 0'a basin");

		int sayi = 0;
		int countPoz = 0;
		int countNeg = 0;
		int pozTop = 0;
		do {
			sayi = scan.nextInt();
			if (sayi < 0) {
				System.out.println("lutfen pozitif sayilar giriniz");
				countNeg++;
			}
			if(sayi>0) {
				countPoz++;
				pozTop += sayi;
			}

		} while (sayi != 0);
		System.out.println(countPoz + " adet pozitif sayi girdiniz ve girdiginiz pozitif sayilarin toplami = " + pozTop);
		System.out.println(countNeg + " adet negatif sayi girdiniz. (negatif sayilar tooplama eklenmemistir.)");
	
	scan.close();
	}

}

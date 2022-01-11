package day17;

import java.util.Scanner;

public class C1_ForLoop {

	public static void main(String[] args) {
		/*
		 * Kullanicidan bir tamsayi girmesini isteyin sayi negatif veya sifirsa
		 * "Lutfen pozitif bir tamsayi giriniz" yazdirin Girilen Sayinin rakamlar
		 * toplamini ayri bir method'da hesaplayin
		 * 
		 * Main method icinde Kullanicidan bir sinir deger isteyin rakamlar toplami
		 * sinir degerden buyukse
		 * "Girdiginiz sayinin rakamlar toplami, girdiginiz sinir degerinden buyuk",
		 * degilse
		 * "Girdiginiz sayinin rakamlar toplami, girdiginiz sinir degerinden buyuk degil"
		 * yazdirin
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen rakamlar toplamini bulmak icin bir tam sayi giriniz");
		int sayi = scan.nextInt();

		if (sayi <= 0) {
			System.out.println("Lutfen pozitif bir tamsayi giriniz");
		} else {
			rakamlarToplamiHesapla(sayi);
		}

		scan.close();
	}

	public static void rakamlarToplamiHesapla(int sayi) {
		int rakamlarToplami = 0;
		String sayi2 = sayi + "";// sayiyi uzunlugunu hesaplamak icin String yaptik

		for (int i = 0; i <= sayi2.length(); i++) {
			rakamlarToplami += sayi % 10;
			sayi /= 10;
		}
		System.out.println("rakamlar toplami= " + rakamlarToplami);

	}

}

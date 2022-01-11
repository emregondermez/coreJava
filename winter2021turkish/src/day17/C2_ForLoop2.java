package day17;

import java.util.Scanner;

public class C2_ForLoop2 {
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

		System.out.println("lutfen pozitif bir tam sayi giriniz");
		Scanner scan = new Scanner(System.in);
		int sayi = scan.nextInt();
		System.out.println("bir sinr deger giriniz");
		int sinir = scan.nextInt();
	
		if (sayi <= 0) {
			System.out.println("Lutfen pozitif bir tamsayi giriniz");
		} else {
			
			rakamlarToplamiYazdir(sayi);
			if (rakamlarToplamiYazdir(sayi) > sinir) {
				System.out.println("Girdiginiz sayinin rakamlar toplami, girdiginiz sinir degerinden buyuk");
			} else {
				System.out.println("Girdiginiz sayinin rakamlar toplami, girdiginiz sinir degerinden buyuk degil");
			}
		}
scan.close();
	}

	public static int rakamlarToplamiYazdir(int sayi) {
		int rakamlarToplami = 0;
		String sayi2 = sayi + "";
		for (int i = 0; i < sayi2.length(); i++) {
			rakamlarToplami += sayi % 10;
			sayi /= 10;
		}

		return rakamlarToplami;

	}

}

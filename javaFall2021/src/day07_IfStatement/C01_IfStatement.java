package day07_IfStatement;

import java.util.Scanner;

public class C01_IfStatement {

	public static void main(String[] args) {
		/*
		 * Soru 2) Kullanicidan gun isimlerinden birinin ilk harfini isteyin ve o harfle
		 * baslayan gun isimlerini yazdirin
		 * 
		 * Ornek: ilkHarf=P output = “Pazar, Pazartesi veya Persembe” ilkHarf=S output =
		 * “Sali” Buyuk kucuk harf problem olmamasi icin toUpperCase methodunu kullanin
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("gun isimlerinden birininin bas harfini giriniz ");

		char harf = scan.next().toLowerCase().charAt(0);

		if (harf == 'p') {
			System.out.println("Pazar" + "\nPazartesi" + "\nPersembe");
		}
		if (harf == 's') {
			System.out.println("Sali");
		}

		if (harf == 'c') {
			System.out.println("Carsamba" + "\nCuma" + "\nCumartesi");
		}

		if (harf != 'p' && harf != 's' && harf != 'c') {
			System.out.println(". . . Gecersiz bir karakter girdiniz . . . ");
		}

		
		scan.close();
	}

}

package day10_SwichCase;

import java.util.Scanner;

public class C4_SwitchCase4 {

	public static void main(String[] args) {
		// kullanicidan VIP(very important person) kisaltmasinda hangi harfin anlamini
		// istedigini bulalim
		// girilen harfin kisaltmasini yazdiralim

		System.out.println("vip kisaltmasinda hangi harfin ne anlama geldigini ogremek icin obu yaz");

		Scanner scan = new Scanner(System.in);
		char harf = scan.next().toLowerCase().charAt(0);

		switch (harf) {
		case 'v':
			System.out.println("very");
			break;
		case 'i':
			System.out.println("important");
			break;
		case 'p':
			System.out.println("person");
			break;
		default:
			System.out.println("gercerli bir harf giriniz");

		}

		// Kullanicinin birden fazla harf girmesini hata olarak gostermek istiyorsak
		// String kullanmaliyiz

		System.out.println("bir harf giriniz");
		String str = scan.next().toLowerCase();

		switch (str) {
		case "v":
			System.out.println("very");
			break;
		case "i":
			System.out.println("important");
			break;
		case "p":
			System.out.println("person");
			break;
		default:
			System.out.println("gercerli bir harf giriniz");

		}
		scan.close();
	}

}

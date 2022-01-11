package day15_MethodCreation;

import java.util.Scanner;

public class C02_MethodCreation {

	public static void main(String[] args) {
		/*
		 * Kullaniciya kac sayi toplalmk istedigini sorun kullanici 2,3,4 sayilarini
		 * girerse kullancidan bu sayilari girmesini isteyin ve sayilarin toplamini
		 * yazdirin 4'den buyuk girerse abartma sen de yazdirin
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Toplamak istediginiz 2,3 ve ya 4 adet sayi giriniz . . . ");
		int tercih = scan.nextInt();

		if (tercih < 2 || tercih > 4) {
			System.out.println("abartma yeniden gir!");
		} else if (tercih == 2) {

			System.out.println(ikiTopla());

		} else if (tercih == 3) {

			System.out.println(ucTopla());

		} else {
			System.out.println(dortTopla());
		}

		
		scan.close();
	}

	private static int dortTopla() {
		Scanner scan = new Scanner(System.in);
		System.out.print("sayi 1 : ");
		int sayi1 = scan.nextInt();
		System.out.print("sayi 2 : ");
		int sayi2 = scan.nextInt();
		System.out.print("sayi 3 : ");
		int sayi3 = scan.nextInt();
		System.out.print("sayi 4 : ");
		int sayi4 = scan.nextInt();
		System.out.print("girdiginiz 4 sayinin toplami : ");
		scan.close();
		return sayi1 + sayi2 + sayi3 + sayi4;

	}

	public static int ucTopla() {
		Scanner scan = new Scanner(System.in);
		System.out.print("sayi 1 : ");
		int sayi1 = scan.nextInt();
		System.out.print("sayi 2 : ");
		int sayi2 = scan.nextInt();
		System.out.print("sayi 3 : ");
		int sayi3 = scan.nextInt();
		System.out.print("girdiginiz 3 sayinin toplami : ");
		scan.close();
		return sayi1 + sayi2 + sayi3;

	}

	public static int ikiTopla() {
		Scanner scan = new Scanner(System.in);
		System.out.print("sayi 1 : ");
		int sayi1 = scan.nextInt();
		System.out.print("sayi 2 : ");
		int sayi2 = scan.nextInt();
		System.out.print("girdiginiz 2 sayinin toplami : ");
		scan.close();
		return sayi1 + sayi2;
	}

}

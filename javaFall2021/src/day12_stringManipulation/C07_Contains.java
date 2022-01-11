package day12_stringManipulation;

import java.util.Scanner;

public class C07_Contains {

	public static void main(String[] args) {
		/*
		 * kullanicidan bir cumle isteyin cumle buyuk kelimesi icerisyorsa tum cumleyi
		 * buyuk harf olarak kucuk kelimesi iceriyorsa tum cumleyi kucuk harfle yazdirin
		 * iki kelimeyi de icermiyorsa "kucuk ve ya buyuk yok" yazdirin
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen cumle giriniz");
		String cumle = scan.nextLine().toLowerCase();

		if (cumle.contains("kucuk") && cumle.contains("buyuk")) {

			System.out.println("kucuk mu buyuk mu karar ver");
		} else if (cumle.contains("kucuk")) {
			System.out.println(cumle);

		} else if (cumle.contains("buyuk")) {
			System.out.println(cumle.toUpperCase());
		} else {
			System.out.println("kucuk ve ya buyuk yok");
		}

		scan.close();
	}

}

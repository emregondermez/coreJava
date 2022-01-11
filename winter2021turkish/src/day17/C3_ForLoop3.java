package day17;

import java.util.Scanner;

public class C3_ForLoop3 {

	public static void main(String[] args) {
		// kullanicidan 35 dan kucuk pozitif bir sayi alin
		// girilen sayinin faktoriyelini yaziran bir method yazdirin

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen faktoriyel hesaplamak icin bir tam sayi giriniz");
		int sayi = scan.nextInt();

		if (sayi <= 0 || sayi > 35) {
			System.out.println("35 dan kucuk giriniz");
		} else {

			faktoriyelBul(sayi);

		}
scan.close();
	}

	public static void faktoriyelBul(int sayi) {
		long faktoriyel = 1;
		for (int i = 1; i <= sayi; i++) {
			faktoriyel *= i;
		}
		System.out.println(faktoriyel);

	}

}

package day18;

import java.util.Scanner;

public class C8_WhileLoop6 {

	public static void main(String[] args) {
		// kullanicinin girdigi sayinin asal olup olmadigini yazdiriniz

		Scanner scan = new Scanner(System.in);
		System.out.println("asal olup olmadigini ogrenmek icin bir sayi giriniz");
		int sayi = scan.nextInt();

		int bolen = 2;
		int flag = 0;
		
		if (sayi > 0) {
			while (bolen <= sayi) {
				if (sayi % bolen == 0) {
					flag++;
				}

				bolen++;
			}
			if (flag > 2) {
				System.out.println("asal degil");
			} else {
				System.out.println("asal");
			}

		} else {
			System.out.println("lutfen gecerli bir deger giriniz");
		}
	scan.close();
	}

}

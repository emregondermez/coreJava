package day16;

import java.util.Scanner;

public class C2_ForLoop2 {

	public static void main(String[] args) {
		// kullanicidan pozitif iki tam sayi alin aldiginiz degerlerden kucuk olandan
		// baslayip buyuk olana kadar
		// tum sayilari yanyana (virgulle ayirarak) yazdirin

		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen iki sayi giriniz");
		int a = scan.nextInt();
		int b = scan.nextInt();

		if (a == b) {
			System.out.println("sayilar esit");
		} else if (a < b) {

			for (int i = a; i <= b; i++) {
				System.out.print(i + ", ");
			}

		} else if (a > b) {
			for (int i = b; i <= a; i++) {
				System.out.print(i + ", ");
			}

		} else {
			System.out.println("lutfen gecerli sayilar giriniz");
		}
	
		
		
		for (int i = 100; i < 50; i--) {
			System.out.print(i + ", ");
		}
		
		
		
		scan.close();
	}

}

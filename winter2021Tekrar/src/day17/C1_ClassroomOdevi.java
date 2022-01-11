package day17;

import java.util.Scanner;

public class C1_ClassroomOdevi {

	public static void main(String[] args) {
		// ==============soru 3============\\
		/*
		 * Konsolda Integer degiskeninin maximum ve minimum degerlerini yazdiran kodu
		 * yaziniz.
		 */

		System.out.println("integer max degeri " + Integer.MAX_VALUE);
		System.out.println("integer min degeri " + Integer.MIN_VALUE);

		// ==============soru 4============\\
		/*
		 * Kullanicidan 3 basamakli bir sayi isteyin ve bu sayinin basamaklari toplamini
		 * konsolda yazdiran programi yaziniz.
		 */

		
		System.out.println("lutfen 3 basamakli bir sayi giriniz");
		Scanner scan = new Scanner(System.in);
		int sayi = scan.nextInt();
		
		if (sayi<0) {
			System.out.println("lutfen pozitif ve 3 basamakli bir sayi giriniz");
		} else if(sayi>99 && sayi<1000) {
			int birlerBas=sayi%10, onlarBas=sayi/10%10,yuzlerBas=sayi/100;
			int rakamlarToplami=birlerBas+onlarBas+yuzlerBas;
			
			System.out.println("girdiginiz sayinin rakamlar toplami= "+rakamlarToplami);
		}else {
			System.out.println("lutfen gecerli bir deger giriniz");
		}
		
		
		scan.close();
	}

}

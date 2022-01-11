package day19_WhileLoop_DoWhileLoop;

import java.util.Scanner;

public class C02_WhileLoop {

	public static void main(String[] args) {
		// Kullanicdan bir sayi alin ve rakamlari toplamini while loop ile yazdirin
		
		Scanner scan = new Scanner (System.in);
		System.out.println("rakamlari toplamini ogrenmek icin bir sayi giriniz");
		int sayi= scan.nextInt();
		int d =sayi;
		int toplam=0;
		int rakam=0;
		
		// 2   
		// rakam 8 + 6+2 = 16
		while(sayi>0) {
		rakam=sayi%10;
		toplam+=rakam;
		sayi/=10;
		
		}System.out.println("girdiginiz sayinin rakamlar toplami =" +toplam);
		
		
		sayi=d;
		int toplam2 =0;
		int rakam2=0;
		for (int i = sayi; i >0; i/=10) {
			
			rakam2=sayi%10;
			toplam2+=rakam2;
		}
		System.out.println("For loop ile girdiginiz sayinin rakamlar toplami =" +toplam2);
		
		scan.close();
	}

}

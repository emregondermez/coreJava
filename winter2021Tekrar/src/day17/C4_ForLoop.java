package day17;

import java.util.Scanner;

public class C4_ForLoop {

	public static void main(String[] args) {
		// kullanicidan 40 dan kucuk bir tam sayi aliniz
		//girilen sayininn faktoriyelini hesaplayip yazdiran bir method olusturun
		
		System.out.println("farktoriyelini hesaplamak icin 35 den kucuk bir sayi giriniz");

		Scanner scan = new Scanner (System.in);
		int sayi = scan.nextInt();
		
		
		if (sayi<=0 || sayi>=35) {
			System.out.println("gecerli bir sayi giriniz");
		} else {
			faktoriyelHesapla(sayi);
		}
		
		
	scan.close();	
	}

	public static void faktoriyelHesapla(int sayi) {
		long faktoriyel=1;
		for (int i = 1; i <=sayi; i++) {
			faktoriyel*=i;
		}System.out.println(faktoriyel);
	}

}

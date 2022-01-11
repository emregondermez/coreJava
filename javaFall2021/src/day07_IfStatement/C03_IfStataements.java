package day07_IfStatement;

import java.util.Scanner;

public class C03_IfStataements {

	public static void main(String[] args) {
		// Kullanicidan bir gun ismi isteyinzi ve tek mi cift mi oldugunu yazdiriniz
		
		
		Scanner scan = new Scanner (System.in);
		System.out.println("tek mi cift mi oldugunu ogrenmek icin bir sayi giriniz");
		int sayi = scan.nextInt();
		
		if (sayi%2==0) {
			System.out.println("cif sayi");
		}
		if (sayi%2==1 || sayi%2==-1) {
			System.out.println("tek sayi");
		}
		
		

		
		scan.close();
	}

}

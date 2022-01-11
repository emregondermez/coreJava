package day14_MethodCreation;

import java.util.Scanner;

public class C02_Question {

	public static void main(String[] args) {
		/*
		 * Kullanicidan 2 sayi isteyin sayilarin karelerini ve kuplerini toplayip
		 * yazdiran iki ayri method yazin kullaniciya us sorun 2 yazarsa karelerini
		 * yazan method 3 yazarsa kuplerini hesaplayan method calissin
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen iki sayi giriniz");
		System.out.print("sayi 1 : ");
		int sayi1 = scan.nextInt();
		System.out.print("sayi 2 : ");
		int sayi2 = scan.nextInt();

		System.out.println("Us kac alinsin ? (2 ya da 3)");
		int us = scan.nextInt();

//		if (us==2) {
//			
//			kareTop(sayi1,sayi2);
//			
//		} else if(us==3) {
//			kupTop(sayi1,sayi2);
//		}else {
//			System.out.println("Lutfen gecerli bir us giriniz");
//		}

		switch (us) {
		case 2:
			kareTop(sayi1, sayi2);
			break;
		case 3:
			kupTop(sayi1, sayi2);
			break;
		default:
			System.out.println("gecerli bir us giriniz");
		}

		scan.close();
	}

	public static void kupTop(int sayi1, int sayi2) {
		System.out.println("sayilarin kupleri toplami : " + ((sayi1 * sayi1 * sayi1) + (sayi2 * sayi2 * sayi2)));

	}

	public static void kareTop(int sayi1, int sayi2) {
		System.out.println("sayilarin kareleri toplami : " + ((sayi1 * sayi1) + (sayi2 * sayi2)));

	}

}

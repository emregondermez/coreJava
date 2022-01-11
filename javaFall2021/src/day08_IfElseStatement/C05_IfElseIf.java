package day08_IfElseStatement;

import java.util.Scanner;

public class C05_IfElseIf {

	public static void main(String[] args) {
		// Soru 6) Kullanicidan iki sayi isteyin, sayilarin ikisi de pozitif ise
		// sayilarin toplamini yazdirin, sayilarin ikisi de negative ise
		// sayilarin carpimini yazdirin, sayilarin ikisi farkli isaretlere
		// sahipse “farkli isaretlerde sayilarla islem yapamazsin” yazdirin,
		// sayilardan sifira esit olan varsa “sifir carpmaya gore yutan elemandir”
		// yazdirin.

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen iki sayi giriniz ");

		System.out.print("Sayi 1 : ");
		int sayi1 = scan.nextInt();

		System.out.print("Sayi 2 : ");
		int sayi2 = scan.nextInt();

		if (sayi1 > 0 && sayi2 > 0) {
			System.out.println("toplamlari : "+(sayi1 + sayi2));
			
			} else if (sayi1 < 0 && sayi2 < 0) {
				System.out.println("carpimlari : "+sayi1*sayi2);
			} else if (sayi1*sayi2<0) {
				System.out.println("farkli isaretlerde sayilarla islem yapamazsin");
			}
		 else {
			 System.out.println("Sifir carpmaya gore yutan elemandir");
			 
		}

		scan.close();
	}

}

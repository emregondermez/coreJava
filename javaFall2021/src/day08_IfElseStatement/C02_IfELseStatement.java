package day08_IfElseStatement;

import java.util.Scanner;

public class C02_IfELseStatement {

	public static void main(String[] args) {
		// Soru 2) Kullanicidan bir karakter
		// girmesini isteyin ve girilen karakterin
		// harf olup olmadigini yazdirin

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir karakter giriniz . . . ");
		char harf = scan.next().charAt(0);

		if ((harf >= 'A' && harf <= 'Z') || (harf >= 'a' && harf <= 'z')) {
			System.out.println("Girilen \'" + harf + "\' karakteri bir harftir");
		} else {
			System.out.println("Girilen \'" + harf + "\' karakteri bir harf degildir");
		}

		scan.close();
	}

}

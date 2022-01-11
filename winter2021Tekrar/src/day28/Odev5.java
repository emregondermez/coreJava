package day28;

import java.util.Scanner;

public class Odev5 {

	public static void main(String[] args) {
		/*
		 * Kullanıcıdan firstName ve lastName'i girmesini isteyin, ardından baş
		 * harflerini büyük harf yapın ve geri kalanı tamamen kucuk harf olarak konsolda
		 * yazdirin. ferhat => Ferhat kirac => Kirac
		 */

		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen adinizi giriniz");
		String firstName = scan.next();
		System.out.println("lutfen soy adinizi giriniz");
		String lastName= scan.next();
		
		System.out.print(firstName.substring(0,1).toUpperCase()+firstName.substring(1));
		System.out.println(" "+lastName.substring(0,1).toUpperCase()+lastName.substring(1));
	
	scan.close();
	}

}

package day07;

import java.util.Scanner;

public class Q13 {
	
	
	public static void main(String[] args) {
		
		/*
         * Kullanicidan bir cumle ve bir harf alin,
         * Cumlede harfin kac kere
         * kullanildigini bulup, yazdirin
         *
         * ORNEK:
         *
         * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
         *
         * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
         */

		Scanner scan = new Scanner (System.in);
    	System.out.println("bir cule giriniz giriniz ");
		String cumle = scan.nextLine();
		System.out.println("cumle icinde aramak istediginiz harfi giriniz");
		char harf = scan.next().charAt(0);
		
		int counter =0;
		for (int i = 0; i < cumle.length(); i++) {
			if (cumle.charAt(i)==harf) {
				counter++;
			}
		}System.out.println("Girdiginiz cumlede \""+harf+"\" harfi "+counter+" kere kullanilmistir");
		
		
		
		
		
		
		scan.close();
	}

}

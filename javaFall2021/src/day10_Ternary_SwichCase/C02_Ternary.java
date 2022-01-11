package day10_Ternary_SwichCase;

import java.util.Scanner;

public class C02_Ternary {

	public static void main(String[] args) {
		// Kullanicidan iki tam sayi alin sayinin tek veya cift oldugunu yazdirin
		
		Scanner scan = new Scanner (System.in);

		
		System.out.print("sayi : ");
		int sayi = scan.nextInt();
		
		System.out.println(sayi%2==0? "cift sayi": "tek sayi");

	scan.close();
	}

}

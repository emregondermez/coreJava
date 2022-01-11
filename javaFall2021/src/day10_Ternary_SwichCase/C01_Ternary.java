package day10_Ternary_SwichCase;

import java.util.Scanner;

public class C01_Ternary {

	public static void main(String[] args) {
		
		// Kullanicidan iki sayi alin ve buyuk olmayani yazdirin
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen iki tam sayi giririniz");
		
		System.out.print("1. sayi : ");
		int sayi1 = scan.nextInt();
		
		System.out.print("2. sayi : ");
		int sayi2 = scan.nextInt();
		
		
		System.out.println(sayi1>sayi2 ? sayi2: sayi1);
	
		
		scan.close();
	}

}

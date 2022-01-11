package day10_Ternary_SwichCase;

import java.util.Scanner;

public class C03_Ternary {

	public static void main(String[] args) {
		// Kullanicidan bir sayi alin ve mutlak degerini yazdirin
	
		Scanner scan = new Scanner (System.in);
		System.out.println("Mutlak degerini hesaplamak icin bir sayi giriniz");
		
		double sayi = scan.nextDouble();
		
		double mutlakDeger = sayi>=0 ? sayi :(-1)*sayi;
		
		System.out.println(mutlakDeger);
	
		
		scan.close();
		
	}

}

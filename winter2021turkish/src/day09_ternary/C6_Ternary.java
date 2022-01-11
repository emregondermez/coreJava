package day09_ternary;

import java.util.Scanner;

public class C6_Ternary {

	public static void main(String[] args) {
		// Kullanicidan bir sayi alin ve sayi 3 basamakli ise “uc basamakli sayi”, 
		//yoksa  “Uc  basamakli degil” yazdirin
	
		
		
		System.out.println("uc basamakli sayi giriniz");
		Scanner scan = new Scanner(System.in);
		int sayi = scan.nextInt();
		
		System.out.println((sayi<-99 && sayi>=-999) || (sayi>99 && sayi<1000) ? "uc basmakli" : "uc basamakli degil");
		
		
	scan.close();
	}

}

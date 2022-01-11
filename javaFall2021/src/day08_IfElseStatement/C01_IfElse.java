package day08_IfElseStatement;

import java.util.Scanner;

public class C01_IfElse {

	public static void main(String[] args) {
		// Soru 1) Kullanicidan dikdortgenin kenar uzunluklarini 
		// isteyin ve dikdortgenin kare olup olmadigini yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("dikdortgenin kenar uzunluklarini giriniz . . . ");
		System.out.print("kenar 1 : ");
		double kenar1 = scan.nextDouble();
		System.out.print("Kenar 2 : ");
		double kenar2 = scan.nextDouble();
		
		if (kenar1==kenar2) {
			System.out.println("karedir");
		} else {
			System.out.println("kare degildir");
		}
	
	scan.close();
	}

}

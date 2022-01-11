package day03;

import java.util.Scanner;

public class C02_Scanner {

	public static void main(String[] args) {
		
		// kullanicidan ismini alip bas harfini yazdiriniz
		
		System.out.println("Lutfen isminizi giriniz");
		Scanner scan = new Scanner(System.in);
		
		char ilkHarf= scan.next().charAt(0);
		
		
		System.out.println("isminizin ilk harfi = "+ilkHarf);
		
		
		scan.close();	
	}

}

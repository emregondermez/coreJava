package day06;

import java.util.Scanner;

public class C4_IfStatement4 {

	public static void main(String[] args) {
		
		
		// Kullanicidan gun ismini isteyin
		// girilen gunun hafta ici veya hafta sonu oldugunu yazdirin
		
		System.out.println("bir gun giriniz");
		
		Scanner scan = new Scanner(System.in);
		String gun1 = scan.next().toUpperCase();
		
		
		//Eger Stringlerde esitlik sorguluyorsak == kullanmmaliyiz
		//Stringlerde esit olma durumunu sorgulamak icin equals() methodunu kullaniriz 
		
		if (gun1.equals("PAZARTESI") || gun1.equals("SALI") || gun1.equals("CARSAMBA") || gun1.equals("PERSEMBE") || gun1.equals("CUMA") ) {
			System.out.println("hafta ici");
		}
		
		if (gun1.equals("CUMARTESI") || gun1.equals("PAZAR")) {
			System.out.println("hafta sonu");
		}
		
		scan.close();

	}

}

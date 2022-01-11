package day06;

import java.util.Scanner;

public class C2_IfStatement2 {

	public static void main(String[] args) {
		//  Kullanicidan gun ismini isteyin
		// girilen gunun hafta ici veya hafta sonu oldugunu yazdirin

		System.out.println("Lutfen bir gun ismi giriniz");
		
		Scanner scan = new Scanner(System.in);
		String dayName = scan.next().toUpperCase();
		
		
		if( dayName.equals("PAZARTESI") || dayName.equals("SALI") || dayName.equals("CARSAMBA") || dayName.equals("PERSEMBE")
		|| dayName.equals("CUMA")) {
			System.out.println(dayName+" "+"HAFTA ICIDIR");
		}
		if (dayName.equals("PAZAR") || dayName.equals("CUMARTESI")) {
			System.out.println( dayName +" "+ "HAFTA SONUDUR");
		}
	
		scan.close();
	
	
	}
	
	
	

}
